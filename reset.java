import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reset extends Actor
{
    /**
     * Act - do whatever the reset wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public reset(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/6,image.getHeight()/6);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
            MyWorld m = new MyWorld();
            Greenfoot.setWorld(m);
        }
    }    
}
