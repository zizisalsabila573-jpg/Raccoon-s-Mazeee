import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Movers implements Collectible
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int rotationSpeed = 1; 
    int currentRotation = 0; 
    boolean rotatingForward = true; 
    int rotationLimit = 25 ; 
    public Coin()
    {
    getImage().scale(getImage().getWidth()/17, getImage().getHeight()/17);
        
    }
    public void act()
    {
      if (rotatingForward) {
        currentRotation += rotationSpeed;
        if (currentRotation >= rotationLimit) {
            rotatingForward = false; 
        }
    } else {
        currentRotation -= rotationSpeed;
        if (currentRotation <= -rotationLimit) {
            rotatingForward = true; 
        }
    }
    

    setRotation(currentRotation);
}
@Override
    public void collect() {
        Greenfoot.playSound("coin.mp3");
        getWorld().removeObject(this);
    }
}

    
