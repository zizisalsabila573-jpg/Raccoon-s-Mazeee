import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World


    {
    
    SimpleTimer tim= new SimpleTimer();
    Counter timeCount = new Counter();
    private GreenfootSound backgroundMusic; 
    private int start = 0;
    private boolean isGameOver = false;

    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        super(550,700,1);
        prepare();
        backgroundMusic = new GreenfootSound("backsound.mp3");
        backgroundMusic.playLoop(); 
        addObject( timeCount, getWidth()/2, getHeight()/2);
        timeCount.setLocation(72,680);
        timeCount.setValue(5);
        
    }
     public GreenfootSound getBackgroundMusic() {
        return backgroundMusic;
    }
    public void act()
    {
        if (start==1)
        {
        if (tim.millisElapsed()> 1000)
        {
            timeCount.add(-1);
            tim.mark();
        }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            start = 1;
            tim.mark();
        }
        if (timeCount.getValue() <= 0) 
        {
        lose();
        }
    }
        
    public void lose()
       {
         if (!isGameOver && timeCount.getValue() <= 0) {
        backgroundMusic.stop(); 
        addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
        Greenfoot.delay(1); 
        isGameOver = true; 
        Greenfoot.playSound("game over.mp3");
        Greenfoot.setWorld(new EndPage(this)); 
    }
    }
      
 
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,12*50,15*50);
        mazeBlock.setLocation(12*50,17*50);
        mazeBlock.setLocation(12*50,16*50);
        mazeBlock.setLocation(10*50,12*50);
        mazeBlock.setLocation(1*50,12*50);
        mazeBlock.setLocation(1*50,12*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,2*50,12*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,3*50,12*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,4*50,12*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,5*50,12*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,6*50,12*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,7*50,12*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,8*50,12*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,9*50,12*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,10*50,12*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,10*50,9*50);
        mazeBlock11.setLocation(10*50,10*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,10*50,9*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,10*50,8*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,10*50,7*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,10*50,6*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,10*50,5*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,10*50,4*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,10*50,3*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,10*50,2*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,10*50,1*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,1*50,11*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,1*50,10*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,1*50,9*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,1*50,8*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,1*50,7*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,1*50,6*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,1*50,5*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,1*50,4*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,9*50,1*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,8*50,1*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,7*50,1*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,6*50,1*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,5*50,1*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,4*50,1*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,1*50,1*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,1*50,2*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,1*50,3*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,3*50,1*50);
        mazeBlock9.setLocation(9*50,12*50);
        mazeBlock9.setLocation(10*50,11*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,4*50,2*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,4*50,3*50);
        mazeBlock39.setLocation(2*50,3*50);
        mazeBlock39.setLocation(2*50,3*50);
        mazeBlock39.setLocation(2*50,3*50);
        mazeBlock40.setLocation(4*50,3*50);
        mazeBlock40.setLocation(3*50,3*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,3*50,4*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,5*50,2*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,5*50,3*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,2*50,6*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,3*50,6*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,4*50,6*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,5*50,6*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,5*50,5*50);
        mazeBlock44.setLocation(2*50,6*50);
        mazeBlock44.setLocation(3*50,7*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,2*50,9*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,3*50,9*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,4*50,9*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,5*50,9*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,5*50,8*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,5*50,7*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,6*50,5*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,7*50,5*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,8*50,5*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,8*50,4*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,8*50,3*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,7*50,3*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,9*50,8*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,8*50,8*50);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,8*50,7*50);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,7*50,7*50);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,8*50,10*50);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,9*50,10*50);
        mazeBlock61.setLocation(7*50,9*50);
        mazeBlock61.setLocation(7*50,9*50);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,3*50,10*50);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,5*50,11*50);
        raccoon raccoon = new raccoon();
        addObject(raccoon,426,569);
        raccoon.setLocation(275,347);
        raccoon.setLocation(441,538);
        raccoon.setLocation(442,654);
        raccoon.setLocation(437,659);
        raccoon.setLocation(424,653);
        raccoon.setLocation(445,598);
        raccoon.setLocation(452,597);
        raccoon.setLocation(450,603);
        raccoon.setLocation(454,655);
        Tomato tomato = new Tomato();
        addObject(tomato,438,463);
        tomato.setLocation(401,447);
        tomato.setLocation(412,450);
        tomato.setLocation(413,454);
        Tomato tomato2 = new Tomato();
        addObject(tomato2,336,499);
        tomato2.setLocation(299,549);
        Tomato tomato3 = new Tomato();
        addObject(tomato3,336,215);
        tomato3.setLocation(297,199);
        Tomato tomato4 = new Tomato();
        addObject(tomato4,213,403);
        tomato4.setLocation(200,352);
        Tomato tomato5 = new Tomato();
        addObject(tomato5,408,282);
        tomato5.setLocation(197,92);
        Tomato tomato6 = new Tomato();
        addObject(tomato6,347,115);
        tomato6.setLocation(445,100);
        Tomato tomato7 = new Tomato();
        addObject(tomato7,184,188);
        tomato7.setLocation(95,204);
        Tomato tomato8 = new Tomato();
        addObject(tomato8,185,482);
        tomato8.setLocation(103,499);
        wolf wolf = new wolf(true);
        addObject(wolf,223,506);
        wolf.setLocation(190,499);
        wolf.setLocation(192,499);
        wolf.setLocation(352,504);
        mazeBlock63.setLocation(404,347);
        removeObject(mazeBlock63);
        mazeBlock48.setLocation(260,239);
        removeObject(mazeBlock48);
        mazeBlock50.setLocation(132,452);
        removeObject(mazeBlock50);
        wolf wolf2 = new wolf(true);
        addObject(wolf2,154,441);
        wolf2.setLocation(151,449);
        removeObject(mazeBlock40);
        wolf wolf3 = new wolf(true);
        addObject(wolf3,396,345);
        wolf wolf4 = new wolf(true);
        addObject(wolf4,246,191);
        wolf4.setLocation(249,256);
        wolf.setLocation(346,547);
        wolf4.setLocation(251,256);
        wolf.setLocation(345,548);
        removeObject(mazeBlock43);
        wolf4.setLocation(155,148);
        tomato3.setLocation(248,249);
        Bear bear = new Bear(true);
        addObject(bear,340,192);
        bear.setLocation(348,197);
        Bear bear2 = new Bear(true);
        addObject(bear2,212,191);
        bear2.setLocation(196,195);
        bear2.setLocation(188,200);
        bear2.setLocation(200,203);
        Bear bear3 = new Bear(true);
        addObject(bear3,327,403);
        bear3.setLocation(348,399);
        wolf wolf5 = new wolf(false);
        addObject(wolf5,92,552);
        removeObject(wolf5);
        Counter counter = new Counter();
        addObject(counter,72,648);
        Coin coin = new Coin();
        addObject(coin,424,568);
        coin.setLocation(108,548);
        coin.setLocation(101,546);
        Coin coin2 = new Coin();
        addObject(coin2,209,555);
        coin2.setLocation(149,547);
        Coin coin3 = new Coin();
        addObject(coin3,424,356);
        coin3.setLocation(304,299);
        Coin coin4 = new Coin();
        addObject(coin4,424,333);
        coin4.setLocation(349,299);
        Coin coin5 = new Coin();
        addObject(coin5,312,465);
        coin5.setLocation(251,499);
        Coin coin6 = new Coin();
        addObject(coin6,224,534);
        coin6.setLocation(203,500);
        Coin coin7 = new Coin();
        addObject(coin7,296,401);
        coin7.setLocation(447,398);
        Coin coin8 = new Coin();
        addObject(coin8,424,337);
        coin8.setLocation(447,347);
        Coin coin9 = new Coin();
        addObject(coin9,443,332);
        coin9.setLocation(446,302);
        Coin coin10 = new Coin();
        addObject(coin10,395,307);
        coin10.setLocation(448,247);
        coin10.setLocation(449,247);
        Coin coin11 = new Coin();
        addObject(coin11,428,607);
        coin11.setLocation(444,599);
        coin11.setLocation(447,594);
        Coin coin12 = new Coin();
        addObject(coin12,174,250);
        coin12.setLocation(99,344);
        coin12.setLocation(100,343);
        Coin coin13 = new Coin();
        addObject(coin13,148,388);
        coin13.setLocation(100,399);
        Coin coin14 = new Coin();
        addObject(coin14,268,159);
        coin14.setLocation(197,147);
        Coin coin15 = new Coin();
        addObject(coin15,330,206);
        coin15.setLocation(249,149);
        mazeBlock60.setLocation(340,135);
        Tomato tomato9 = new Tomato();
        addObject(tomato9,340,135);
        mazeBlock60.setLocation(300,100);
        tomato9.setLocation(353,151);
        Coin coin16 = new Coin();
        addObject(coin16,452,211);
        coin16.setLocation(247,199);
        raccoon.setLocation(444,628);
        raccoon.setLocation(450,624);
        Chance1 chance1 = new Chance1();
        addObject(chance1,224,626);
        chance1.setLocation(148,648);
        Chance2 chance2 = new Chance2();
        addObject(chance2,371,660);
        chance2.setLocation(197,647);
        Chance3 chance3 = new Chance3();
        addObject(chance3,372,633);
        chance3.setLocation(248,647);
        Door door = new Door();
        addObject(door,180,123);
        door.setLocation(100,22);
        Key key = new Key();
        addObject(key,166,400);
        key.setLocation(192,339);
        tomato4.setLocation(211,363);

        chance1.setLocation(147,657);
        removeObject(chance1);
        removeObject(chance2);
        removeObject(chance3);
        Chance1 chance11 = new Chance1();
        addObject(chance1,245,650);
        chance1.setLocation(250,652);
        Chance1 chance12 = new Chance1();
        addObject(chance12,196,644);
        chance12.setLocation(199,652);
        Chance1 chance13 = new Chance1();
        addObject(chance13,151,648);
        chance13.setLocation(151,652);
    }
    
}
