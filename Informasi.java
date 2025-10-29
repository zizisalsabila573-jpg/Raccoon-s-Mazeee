import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Informasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Informasi extends Button
{
    /**
     * Act - do whatever the Informasi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new infoPage());
            Greenfoot.playSound("button.mp3");
        }
    }
}
