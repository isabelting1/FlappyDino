import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappyBird extends Actor
{
    private int gravity = 1;
    private int jumpDelay = 0;
    private boolean flapped = false;
    /**
     * Act - do whatever the flappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public flappyBird(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth(),image.getHeight());
    }
    public void act(){
        if(isTouching(Tube.class)){
                GameOverFlappy g = new GameOverFlappy();
                Greenfoot.setWorld(g);
        }
        if((Greenfoot.isKeyDown("space")||Greenfoot.isKeyDown("up"))&&jumpDelay<=0&&!flapped){
            flap();
            //Greenfoot.playSound("eating.wav");
        }
        setLocation(getX(), getY()+gravity);
        turn(1);
        if(flapped&&!Greenfoot.isKeyDown("space")){
            gravity = -gravity;
            flapped = false;
        }
    }
    public void flap(){
        int height = getY();
        flapped = true;
        jumpDelay = 2;
        while(jumpDelay>=0&&(getY()>height-20)){
            jumpDelay--;
            setLocation(getX(), getY()-gravity);
            turn(-1);
        }
        flapped = false;
        
        
    }
}