import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endWin extends World
{private GreenfootSound winSound;

    /**
     * Constructor for objects of class endWin.
     * 
     */
    public endWin(MyWorld myWorld)
    {    
        super(550, 700, 1); 
        prepare(); 
        myWorld.getBackgroundMusic().stop(); 
        winSound = new GreenfootSound("win.mp3");
        winSound.play(); 
    }
    
    private void prepare()
    {

        Win win = new Win();
        addObject(win,280,363);
        win.setLocation(280,363);
        win.setLocation(277,382);
        win.setLocation(497,363);
        win.setLocation(484,314);
        win.setLocation(256,339);
        win.setLocation(274,381);
        Exit exit = new Exit();
        addObject(exit,260,604);
        exit.setLocation(261,637);
    }
}
