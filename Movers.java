import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import greenfoot.World;

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Movers extends Actor
{
    int speed = 3;
    int count = 0;
    private int touchCount=0;
    int keymove ;
    int openDoor;
    int endGame ;
    private int chances = 3;  
    private Actor[] lifeIcons = new Actor[chances]; 
    public int lives = 3; 
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public void act()
    {
        
    }
    public void moveAndTurn() {
     if (Greenfoot.isKeyDown("right")) 
     {
            setRotation(0);
            move(3);
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            
            setRotation(180);
            move(3); 
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            setRotation(270);
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            setRotation(90);
            move(3);
        }
    }
    public void slideAround() {
    int x = getX();
    int y = getY();

    if (Greenfoot.isKeyDown("right")) {
        setLocation(x + speed , y); 
        if(hitWalls())
        {
         setLocation(x , y);
        }
    }
    
    
    if (Greenfoot.isKeyDown("left")) {
        setLocation(x - speed , y); 
        if(hitWalls())
        {
         setLocation(x , y);
        }
    }
    
    
    if (Greenfoot.isKeyDown("up")) {
        setLocation(x, y - speed ); 
        if(hitWalls())
        {
         setLocation(x , y );
        }
    }
    
    
    if (Greenfoot.isKeyDown("down")) {
        setLocation(x, y + speed ); 
        if(hitWalls())
        {
         setLocation(x, y );
        }
    }
    }
      public boolean hitWalls()
    {
    if (isTouching(MazeBlock.class))
    {
    return true;
    } 
    else
    {
    return false;
    }
    }
    public Counter timeCount;    
    public void collectCheese()
    {
     if (isTouching(Tomato.class))
     {
        removeTouching(Tomato.class);
        MyWorld world = (MyWorld) getWorld();
        world.timeCount.setValue(world.timeCount.getValue() + 5);
        Greenfoot.playSound("tomato.mp3");  
        }
     }
    
    public void collectCoin()
    {
     if (isTouching(Coin.class))
     {
       removeTouching(Coin.class);
       Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
       counter.add(1);
       Greenfoot.playSound("coin.mp3"); 
     }
    }
    private int boomTimer = 0;
    private boolean hasBoomed ;
    public void Snake()
    {
    if (isTouching(Bear.class)) {
        raccoon hamms = (raccoon) getOneIntersectingObject(raccoon.class);
        if (hamms != null) {
            hamms.setLocation(450, 624); 
        }

        if (!hasBoomed) {  
            Boom boom = new Boom(); 
            getWorld().addObject(boom, getX(), getY()); 
            boomTimer = 10;  
            hasBoomed = true; 
            Greenfoot.playSound("boom.mp3");
        }

        if (boomTimer > 0) {
            boomTimer--;  
        } else {
            getWorld().removeObjects(getWorld().getObjects(Boom.class));  
            hasBoomed = false;  
        }
       
    } else {
        hasBoomed = false;  
    }
    }
    
   
     public void decreaseChances() {
    if (chances > 0) {
        chances--;  
        World world = getWorld();   
        world.removeObject(lifeIcons[chances]);  
    }
    if (chances == 0) {
        Greenfoot.stop();  
    }
}
    private boolean hasKey = false;  
    private Actor key;
    public void Key() { 
        if (isTouching(Key.class) && !hasKey) {
            key = getOneIntersectingObject(Key.class);
            hasKey = true;
            Greenfoot.playSound("key.mp3"); 
        }

        if (hasKey && key != null) {
            key.setLocation(getX(), getY());
        }
    }
    
    public void Win() {
        if (isTouching(Key.class) ) 
        {
            getWorld().addObject(new Win(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            removeTouching(raccoon.class);
            removeTouching(Key.class);
            Greenfoot.playSound("win.mp3"); 
            
            MyWorld myWorld = (MyWorld) getWorld();  
            if (myWorld.getBackgroundMusic() != null) {
            myWorld.getBackgroundMusic().stop();  
        }   
            Greenfoot.setWorld(new endWin(myWorld));
        }
        
    }
    public void endGame() {
        Greenfoot.stop();  
    }
}
    





       
        
        
        
    




