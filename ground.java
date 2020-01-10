import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int count = 0; 
    static int score = 0; 
    static int groundSpeed = 7;
    public static void groundAct() {
        groundSpeed = 7 + (score/100);
        score = DinoWorld.getScore();
    }
    
    public void act() 
    {
        setLocation(getX()- groundSpeed ,getY());
        
        if (getX() == 0) {
            getWorld().addObject(new Ground(), 800, 300);
            getWorld().removeObject(this);
        }
        
        groundAct();
        
    }   
    
    
}