import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tube extends Actor
{
    /* Act - do whatever the Tube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tube(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5,image.getHeight()/4);
    }
    public Tube(boolean reverse){
        if(reverse){
            setImage("flappy-bird-pipe-clipart-5-original(2).png");
        }
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5,image.getHeight()/4);
    }
    public void act() 
    {
        this.setLocation(getX()-3, getY());
        if(getX()==0){
            if(getY()>=250){
                MyWorld world = (MyWorld)getWorld();
                world.addScore(1);
            }
            getWorld().removeObject(this);
        }
    }
}