import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pterodactyl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pterodactyl extends Actor
{
    
    /**
     * Act - do whatever the Pterodactyl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage down = new GreenfootImage("Pterodown.png");
    GreenfootImage up = new GreenfootImage("Pterodactyl.png");
    int count;
    public void act() 
    {
        setLocation(getX()-7, getY());
        count++;
        
        if (count % 40 < 20) {
            setImage(down);
        }
        else {
            setImage(up);
        }
    }
}
