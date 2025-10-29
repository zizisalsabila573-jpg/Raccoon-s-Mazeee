import greenfoot.*;  

/**
 * Write a description of class flyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wolf extends Movers
{
    /**
     * Act - do whatever the flyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    private boolean visible = true;
    private long disappearTime; 
    private boolean recentlyHit = false; 
    private long lastHitTime = 0; 
    private final int hitCooldown = 2000; 
    private GreenfootSound gerakan = new GreenfootSound("gerakan.mp3");
    
    public wolf(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/20, getImage().getHeight()/20);
        upDown= upAndDown;
            }
    
    public void act()
    {
        moveAround();
        enemyhitWalls();
        checkVisibility();
        WolfhitRaccoon(); 

    }
    public void enemyhitWalls()
    {
        if(hitWalls())
        {
            speed = -speed;
        }
    }
    public void WolfhitRaccoon()
    {
        long currentTime = System.currentTimeMillis(); 

        
        if(isTouching(raccoon.class) && !recentlyHit)
        {
            Greenfoot.playSound("gerakan.mp3");
            gerakan.setVolume(100); 
            removeTouching(Chance1.class); 
            lastHitTime = currentTime; 
            recentlyHit = true; 
        }

        
        if (recentlyHit && currentTime - lastHitTime > hitCooldown)
        {
            recentlyHit = false; 
        }
    }
    public void moveAround()
    {
        int x = getX();
        int y = getY();
        if(upDown)
        {
        setLocation(x,y+speed);
        }
        else if (!upDown)
        {
        setLocation(x+speed, y);
        }
    }
    

    public void checkVisibility() {
        if (!visible && System.currentTimeMillis() > disappearTime) {
            setVisible(true); 
        }
    }

    public boolean isVisible() {
        return visible;
    }
    
    public void hideForSeconds(int seconds) {
        visible = false; 
        disappearTime = System.currentTimeMillis() + (seconds * 1000); 
        setVisible(false); 
    }

    public void setVisible(boolean isVisible) {
        visible = isVisible; 
        if (visible) {
            getImage().setTransparency(255); 
        } else {
            getImage().setTransparency(0); 
        }
    }
}

