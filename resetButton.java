import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resetButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resetButton extends Actor
{
    /**
     * Act - do whatever the resetButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     getImage().scale(100,100);
        if (Greenfoot.mouseClicked(this) || "a".equals(Greenfoot.getKey())) {
            Greenfoot.setWorld(new DinoWorld());
        }
    }    
}
