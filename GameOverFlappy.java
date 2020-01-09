import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverFlappy extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOverFlappy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        addObject(new loss(), 300, 100);
        addObject(new scoreboard(), 290, 200);
        addObject(new reset(), 300, 280);
        if(MyWorld.getScore()<10&&MyWorld.getScore()>0){
            showText("0" + MyWorld.getScore(), 366, 186);
        }
        else{
            showText("" + MyWorld.getScore(), 366, 186);            
        }
        if(MyWorld.getBest()<10&&MyWorld.getBest()>0){
            showText("0" + MyWorld.getBest(), 366, 234);
        }
        else{
            showText("" + MyWorld.getBest(), 366, 234);            
        }
    }
}
