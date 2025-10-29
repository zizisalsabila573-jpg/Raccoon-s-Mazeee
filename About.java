import greenfoot.*;  


public class About extends World
{

    /**
     * Constructor for objects of class About.
     * 
     */
    public About()
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
        addObject(exit,269,594);
        exit.setLocation(288,589);
    }
}
