import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor implements Clickable
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button()
    {
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/7);
        
    }
     
    public void act()
    {
        
    }
     @Override
    public void onClick() {
        Greenfoot.playSound("click.mp3");
        Greenfoot.setWorld(new MyWorld());
    }

    private void handleClick() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }
}
