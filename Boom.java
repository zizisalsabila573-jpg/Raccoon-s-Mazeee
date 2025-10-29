import greenfoot.*;  

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Movers
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boom()
    {
    getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
    public void act()
    {
        Snake();
    }
}
