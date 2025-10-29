import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Movers
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean leftRight;
    int speed = 2;
    
    private boolean hitHammsRecently = false; 

    public Bear(boolean leftAndRight)
    {
        getImage().scale(getImage().getWidth()/20, getImage().getHeight()/20);
        leftRight=leftAndRight;
    }
    public void act()
    {
        moveAround();
        enemyhitWalls();
        BearhitRaccoon();
    }
    public void enemyhitWalls()
    {
        if(hitWalls())
        {
            speed = -speed;
        }
    }
    
    
    public void BearhitRaccoon()
    {

        }
    
    private void moveAround()
    {
        int x = getX();
        int y = getY();
        if(leftRight)
        {
        setLocation(x+speed,y);
        }
        else if (!leftRight)
        {
        setLocation(x, y+speed);
        }
    }
   
}
