import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int turnInt; 
    public Asteroid(int rotation) {
        turnInt = rotation;
    }
    public void act() 
    {        
        setLocation(getX()-10, getY()+4);
        turn(turnInt);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        
        if (isTouching(tRex.class)) {
            Greenfoot.stop();
        }
    }    
}
