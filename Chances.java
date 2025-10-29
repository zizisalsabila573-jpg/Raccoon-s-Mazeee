import greenfoot.*;  

/**
 * Write a description of class Chances here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chances extends Movers
{
    /**
     * Act - do whatever the Chances wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Chances()
    {
    getImage().scale(getImage().getWidth()/15, getImage().getHeight()/15);
        
    }
    public void act()
    {
      
        decreaseChances();
    }
}
