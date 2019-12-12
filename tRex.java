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
    GreenfootImage right = new GreenfootImage("Dino-right-up.png");
    GreenfootImage left = new GreenfootImage("dino-left-up.png");
    public void act() 
    {
        count++;
        if (count % 40 < 20) {
            setImage(right);
        }
        else {
            setImage(left);
        }
    }    
}
