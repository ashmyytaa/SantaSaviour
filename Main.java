import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{
    GreenfootSound bgMusic1 = new GreenfootSound("Deck the Halls.wav");
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {    
        super(900, 800, 1); 
        GreenfootImage bg = new GreenfootImage("tree.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SantaSav santaSav = new SantaSav();
        addObject(santaSav,800,400);
        santaSav.setLocation(500,400);
        Start start = new Start();
        addObject(start,772,729);
        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo, 118, 750);
    }
}
