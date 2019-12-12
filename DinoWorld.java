import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinoWorld extends World
{

    /**
     * Constructor for objects of class DinoWorld.
     * 
     */
    public DinoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,400,300);
        tRex tRex = new tRex();
        addObject(tRex,100,290);
    
    }
}
