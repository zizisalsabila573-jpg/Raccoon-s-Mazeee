import greenfoot.*;  

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{

    /**
     * Constructor for objects of class Play.
     * 
     */
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public GreenfootSound backsound = new GreenfootSound("backsound.mp3");
    private boolean isMusicPlaying = true; 
    
    public void stopped()
    {
        if (backsound.isPlaying()) 
        {
            backsound.stop();
        }
    }
     
    public void started()
    {
        if (!backsound.isPlaying() && isMusicPlaying) {
            backsound.playLoop(); 
            backsound.setVolume(50);
        }
    }
    
    
    
    public void stopMusic()
    {
        if (isMusicPlaying) {
            backsound.stop();  
            isMusicPlaying = false; 
        }
    }

    
    public void act()
    {
        if (Greenfoot.mouseClicked(getObjects(PlayGame.class).get(0))) {
            stopMusic(); 
        }
    }
    public Play()
    {    
        super(550, 700, 1); 
        prepare();
        
    }
    private void prepare()
    {
        PlayGame playGame = new PlayGame();
        addObject(playGame,271,351);
        playGame.setLocation(298,348);
        Informasi informasi = new Informasi();
        addObject(informasi,304,378);
        playGame.setLocation(299,402);
        More more = new More();
        addObject(more,301,424);
        informasi.setLocation(307,451);
        playGame.setLocation(288,335);
        informasi.setLocation(270,431);
        playGame.setLocation(296,383);
        playGame.setLocation(305,333);
        playGame.setLocation(288,298);
        informasi.setLocation(296,364);
        playGame.setLocation(299,307);
        informasi.setLocation(300,424);
        informasi.setLocation(300,425);
        informasi.setLocation(230,394);
        informasi.setLocation(273,506);
        playGame.setLocation(280,366);
        playGame.setLocation(299,320);
        playGame.setLocation(299,290);
        playGame.setLocation(316,374);
        informasi.setLocation(291,447);
        informasi.setLocation(329,522);
        informasi.setLocation(328,471);
        playGame.setLocation(336,367);
        informasi.setLocation(357,459);
        informasi.setLocation(290,475);
        informasi.setLocation(257,576);
        playGame.setLocation(286,427);
        playGame.setLocation(292,294);
        more.setLocation(293,425);
        informasi.setLocation(299,524);
        more.setLocation(290,401);
        informasi.setLocation(315,516);
        more.setLocation(311,382);
        informasi.setLocation(317,500);
        playGame.setLocation(314,385);
        informasi.setLocation(326,519);
        playGame.setLocation(331,361);
        playGame.setLocation(342,315);
        playGame.setLocation(334,306);
        informasi.setLocation(312,498);
        playGame.setLocation(306,406);
        more.setLocation(312,298);
        playGame.setLocation(322,392);
        playGame.setLocation(253,401);
        informasi.setLocation(249,525);
        informasi.setLocation(305,514);
        more.setLocation(279,292);
        playGame.setLocation(298,406);
        removeObject(more);
        removeObject(playGame);
        removeObject(informasi);
        PlayGame playGame1 = new PlayGame();
        addObject(playGame,275,403);
        Informasi informasi2 = new Informasi();
        addObject(informasi2,273,469);
        playGame.setLocation(277,469);
        playGame.setLocation(301,405);
        playGame.setLocation(302,367);
        playGame.setLocation(299,393);
        informasi2.setLocation(318,446);
        More more2 = new More();
        addObject(more2,295,336);
        playGame.setLocation(286,341);
        playGame.setLocation(312,387);
        informasi2.setLocation(337,440);
        informasi2.setLocation(333,494);
        playGame.setLocation(330,361);
        playGame.setLocation(342,381);
        playGame.setLocation(288,412);
        playGame.setLocation(324,391);
        playGame.setLocation(324,392);
        playGame.setLocation(306,370);
        playGame.setLocation(316,317);
        playGame.setLocation(312,402);
        playGame.setLocation(325,404);
        removeObject(more2);
        removeObject(playGame);
        removeObject(informasi2);
        PlayGame playGame2 = new PlayGame();
        addObject(playGame,280,410);
        More more4 = new More();
        addObject(more2,294,327);
        more2.setLocation(280,344);
        Informasi informasi3 = new Informasi();
        addObject(informasi2,280,465);
        playGame.setLocation(281,472);
        playGame.setLocation(315,412);
        playGame.setLocation(287,507);
        playGame.setLocation(293,509);
        playGame.setLocation(290,537);
        playGame.setLocation(305,567);
        more2.setLocation(338,435);
        more2.setLocation(358,278);
        more2.setLocation(328,385);
        playGame.setLocation(326,508);
        more2.setLocation(304,337);
        playGame.setLocation(320,428);
        playGame.setLocation(345,501);
        playGame.setLocation(328,643);
        informasi2.setLocation(338,522);
        more2.setLocation(316,421);
        more2.setLocation(297,256);
        informasi2.setLocation(301,372);
        playGame.setLocation(330,512);
        informasi2.setLocation(311,395);
        playGame.setLocation(314,552);
        playGame.setLocation(433,665);
        informasi2.setLocation(217,622);
        playGame.setLocation(504,673);
        informasi2.setLocation(126,675);
        playGame.setLocation(314,666);
        more2.setLocation(507,673);
        informasi2.setLocation(112,664);
        playGame.setLocation(325,635);
        more2.setLocation(508,667);
        informasi2.setLocation(100,601);
        informasi2.setLocation(99,678);
        playGame.setLocation(314,627);
        more2.setLocation(504,672);
        playGame.setLocation(244,258);
        informasi2.setLocation(98,263);
        more2.setLocation(403,261);
        more2.setLocation(354,263);
        playGame.setLocation(297,628);
        playGame.setLocation(266,621);
        more2.setLocation(496,675);
        more2.setLocation(476,669);
        informasi2.setLocation(48,668);
        informasi2.setLocation(73,660);
    }
}
