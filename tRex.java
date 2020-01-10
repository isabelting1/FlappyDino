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
    
    private int ySpeed;
    
    int count = 0;
    int score = 0;
    int obstacleSpeed = 7;
    boolean canAddTree = true;
    int lastTreeCount = 0;
    boolean canAddPterodactyl = true;
    int lastPterodactylCount = 0; 
    
    GreenfootImage right = new GreenfootImage("Dino-right-up.png");
    GreenfootImage left = new GreenfootImage("dino-left-up.png");
    GreenfootImage stand = new GreenfootImage("Dino-stand.png");
    GreenfootImage duckRight = new GreenfootImage("dino-duck.png");
    GreenfootImage duckLeft = new GreenfootImage("dino-duck-left.png");
    public void act() 
    {
        count++;
        score = DinoWorld.getScore(); 
        walk();
        jump();
        duck();
        obstacleSpeed = 7 + (score/100);
        addTree();
        addPterodactyl();
        gameOver();
        
    } 
    
    public void gameOver() {
        if (isTouching(Tree.class) || isTouching(Pterodactyl.class)) {
            Ground.count = 0;
            Ground.score = 0;
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
        
        if (canAddTree && Greenfoot.getRandomNumber(100) < 1 && count - lastPterodactylCount > 50) {
            getWorld().addObject(new Tree(obstacleSpeed),799,285);
            canAddTree = false;
            lastTreeCount = count;
        }
        
        if (count - lastTreeCount > 150) {
            canAddTree = true;
        }
    }    
    
    public void addPterodactyl() {

        if (canAddPterodactyl && score > 200 && Greenfoot.getRandomNumber(100) < 0.5) {
            getWorld().addObject(new Pterodactyl(obstacleSpeed, (int)Greenfoot.getRandomNumber(3)),799,0);
            canAddPterodactyl = false;
            lastPterodactylCount = count;
        }
        
        if (count - lastPterodactylCount > 150) {
            canAddPterodactyl = true;
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
