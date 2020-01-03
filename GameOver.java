import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels; 
        super(800, 400, 1); 
        prepare();
        
        
    }
    
    public void prepare() {
        Border border = new Border();
        addObject(border,25,200);
        Border border2 = new Border();
        addObject(border2,775,200); 
        addObject(new resetButton(), 400,250);
        
        GreenfootImage gameOver = new GreenfootImage("GAME OVER", 70, Color.BLACK, null);
        gameOver.setFont(new Font("Times New Roman", false, false, 100));
        getBackground().drawImage(gameOver,215,100);
        
       showText("Click the button or press 'a'",400,350);
    }
}
