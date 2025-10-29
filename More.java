import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class More here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class More extends Button
{
    /**
     * Act - do whatever the More wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new About());
            Greenfoot.playSound("button.mp3");
        }
    }
}
