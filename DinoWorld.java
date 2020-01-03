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
    int count = 0;
    int speed = 50;
    int score;
    public DinoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        setPaintOrder(Border.class,Asteroid.class,tRex.class,Tree.class);
        prepare();
    }
    
    public void act() {
        showScore();
        count++;
     
        
    }  
    
    
    public void showScore() {
        score = count/5;
        String c = Integer.toString(score);
        showText(c,25,25);
    }
    
    public int getScore() {
        return score;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for (int i = 0; i <= (getWidth()/94); i++) {
            addObject(new Ground(),i * 94 ,300);
        }
        
        tRex tRex = new tRex();
        addObject(tRex,125,275);
        Border border = new Border();
        addObject(border,25,200);
        Border border2 = new Border();
        addObject(border2,775,200); 
        addObject(new Tree(7), 600,285);
        addObject(new Pterodactyl(), 400, 175);
        addObject(new Pterodactyl(), 400, 225);
        addObject(new Pterodactyl(), 400, 275);
        
 }

}
