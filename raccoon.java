import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MazeHamms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class raccoon extends Movers implements Movable, Damageable, Resettable
{
   private int health = 3;
   /**
     * Act - do whatever the MazeHamms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private long disappearTime; 
    
    public raccoon()
    {
        getImage().scale(getImage().getWidth()/12, getImage().getHeight()/12);
        
    }
   
    public void act()
    {
        slideAround();
        collectCheese();
        collectCoin();
        Snake();
        Key();
       checkCollisionWithWolf();
    }
    
    public void checkCollisionWithWolf() {
        wolf wolf = (wolf) getOneIntersectingObject(wolf.class);
        if (wolf != null && wolf.isVisible()) {
            lives--; 
            wolf.hideForSeconds(1); 
            updateLivesIcon(); 
        }
    }
    
    public void updateLivesIcon() {
        List Listchance1 = getWorld().getObjects(Chance1.class);
            if (Listchance1.size()>0){
                Chance1 chance1 = (Chance1)Listchance1.get(0);
                getWorld().removeObject(chance1);
      
            }   
            
            if (lives <= 0) {
            
            MyWorld myWorld = (MyWorld) getWorld(); 
            myWorld.getBackgroundMusic().stop(); 
            Greenfoot.setWorld(new EndPage(myWorld));
            }         
        }
     @Override
public void moveUp() {
    setLocation(getX(), getY() - 5);
}

@Override
public void moveDown() {
    setLocation(getX(), getY() + 5);
}

@Override
public void moveLeft() {
    setLocation(getX() - 5, getY());
}

@Override
public void moveRight() {
    setLocation(getX() + 5, getY());
}
@Override
    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            Greenfoot.playSound("game over.mp3");
            
            getWorld().removeObject(this);
        }
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }
@Override
public void resetPosition() {
    if (getWorld() != null) {  
        setLocation(426,569);
    }
}
}
