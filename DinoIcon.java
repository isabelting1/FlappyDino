import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinoIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinoIcon extends Actor
{
    /**
     * Act - do whatever the DinoIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public DinoIcon() {
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new DinoWorld());
        }
    }    
}
