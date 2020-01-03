import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tRex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tRex extends Actor
{
    /**
     * Act - do whatever the tRex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    int score;
    int obstacleSpeed = 7;
    private int ySpeed;
    GreenfootImage right = new GreenfootImage("Dino-right-up.png");
    GreenfootImage left = new GreenfootImage("dino-left-up.png");
    GreenfootImage stand = new GreenfootImage("Dino-stand.png");
    GreenfootImage duckRight = new GreenfootImage("dino-duck.png");
    GreenfootImage duckLeft = new GreenfootImage("dino-duck-left.png");
    public void act() 
    {
        count++;
        walk();
        jump();
        duck();
        gameOver();
        addTree();
        obstacleSpeed = 7 + (score/100);
        getWorld().showText(Integer.toString(obstacleSpeed),400,375);
        
    } 
    
    public void gameOver() {
        if (isTouching(Tree.class) || isTouching(Pterodactyl.class)) {
            Greenfoot.setWorld(new GameOver());
        }
        
        if (count == 5000) {
            getWorld().showText("CONGRATULATIONS! You reached the highest level! ",400, 375);
            Greenfoot.delay(100);
            getWorld().addObject(new Asteroid(3), 800,0);
            getWorld().addObject(new Asteroid(4), 775, 25);
            getWorld().addObject(new Asteroid(5), 725, 0);
        }
        
        
    }
    
    public void addTree() {
        if (count % 100 < 25 && Greenfoot.getRandomNumber(100) < 1) {
            getWorld().addObject(new Tree(obstacleSpeed),799,285);
            
        }
    }
    public void jump() {
        
        int groundLevel = 275;
        boolean onGround = (getY() == groundLevel);
        if (!onGround){
            setImage(stand);
            ySpeed++;
            setLocation(getX(), getY()+ ySpeed); 
            if (getY()>=groundLevel)
            {
                setLocation(getX(), groundLevel);
                Greenfoot.getKey();
           }
        }
        else
        {
            if ( "up".equals(Greenfoot.getKey())) {
                ySpeed = -17;
                setLocation(getX(), getY()+ySpeed); 
            }
        }
    }
    public void walk() {
        if (count % 40 < 20) {
            setImage(right);
        }
        else {
            setImage(left);
        }
    }
    
    public void duck() {
        if (Greenfoot.isKeyDown("down")) {
            if (count % 40 < 20) {
            setImage(duckLeft);
            }
            else {
            setImage(duckRight);
              }
            setLocation(getX(), getY() + 15);

        }
    }
}
