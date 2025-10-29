import greenfoot.*;  

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Movers
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Door()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);

    }

    public void act()
    {
        Win();
    }

    
}