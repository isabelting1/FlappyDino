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
    int height;
    int speed;
    public Pterodactyl(int speed, int height) {
        switch (height) {
            case 1:
                this.height = 200;
                break;
            case 2:
                this.height = 250;
                break;
            case 3:
                this.height = 300;
                break;
            default: 
                this.height = 250;
                break;
        
        }
        this.speed = speed;
    }
    public void act() 
    {
        setLocation(getX()-speed, this.height);
        count++;
        
        if (count % 40 < 20) {
            setImage(down);
        }
        else {
            setImage(up);
        }
    }
}
