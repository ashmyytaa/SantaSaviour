import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factory extends World
{   GreenfootSound bgMusic = new GreenfootSound("wintery loop.wav");
    private Counter theCounter;
    /**
     * Constructor for objects of class Factory.
     * 
     */
    public Factory()
    {    
        super(900, 800, 1); 
        started();
        theCounter = new Counter();
        addObject(theCounter, 110,27);
        prepare();
    }

    public void started()
    {
        bgMusic.playLoop();
    }

    public Counter getCounter()
    {
        return theCounter;
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(2000)<2) 
        {
            Gift1 gift = new Gift1();
            addObject(gift, Greenfoot.getRandomNumber(getWidth()), gift.getImage().getHeight());
        }   
        if (Greenfoot.getRandomNumber(6000)<10) 
        {
            Gift2 gift2 = new Gift2();
            addObject(gift2, Greenfoot.getRandomNumber(getWidth()), gift2.getImage().getHeight());
        }
        if (Greenfoot.getRandomNumber(6000)<10) 
        {
            Gift3 gift3 = new Gift3();
            addObject(gift3, Greenfoot.getRandomNumber(getWidth()), gift3.getImage().getHeight());
        }
    
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sac sac = new Sac();
        addObject(sac,426,691);
        sac.setLocation(467,673);
        Level1instruc level1instruc = new Level1instruc();
        addObject(level1instruc, 308, 797);
    }
}
