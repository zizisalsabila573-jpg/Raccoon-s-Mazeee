import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoPage extends World
{

    /**
     * Constructor for objects of class infoPage.
     * 
     */
    public infoPage()
    {    
        super(550, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,256,578);
        exit.setLocation(274,594);
    }
}
