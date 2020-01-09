import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/* Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* Constructor for objects of class MyWorld.
     */
    public static int bestScore = 0;
    public static int score = 0;
    private Tube tube = new Tube(false);
    private Tube tube2 = new Tube(true);
    private int time = 0;
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1);
        score = 0;
        addObject(new flappyBird(), 51, 200);
    }
    public void act() 
    {
        addObject(tube, 590, (int)(Math.random()+250)+520);
        addObject(tube2, tube.getX(), tube.getY()-1000);
        if(tube.getX()<=300){
            tube = new Tube();
            addObject(tube, 590, Greenfoot.getRandomNumber(40) + 250);
            tube2 = new Tube(true);
            addObject(tube2, tube.getX(), (int)(Math.random()*100)+(tube.getY()-315));
        }
        showScore();
        if(score>bestScore){
            bestScore = score;
        }
    }
    public void addScore(int points){
        score += points;
        showScore();
    }
    private void showScore(){
    showText("Score " + score, 50, 25);
    }
    public static int getScore(){
        return score;
    }
    public static int getBest(){
        return bestScore;
    }
}