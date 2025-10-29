import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndPage extends World
{
private GreenfootSound gameOverSound;
    /**
     * Constructor for objects of class EndPage.
     * 
     */
    public EndPage(MyWorld myWorld)
    {    
        super(550, 700, 1); 
        prepare();
        myWorld.getBackgroundMusic().stop(); 
        gameOverSound = new GreenfootSound("game over.mp3");
        gameOverSound.play(); 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,302,533);
        exit.setLocation(281,601);
        GameOver gameOver = new GameOver();
        addObject(gameOver,272,364);
        gameOver.setLocation(287,371);
        gameOver.setLocation(288,397);
        gameOver.setLocation(282,397);
    }
}
