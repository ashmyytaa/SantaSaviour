import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VanierLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VanierLogo extends Actor
{
    /**
     * Act - do whatever the VanierLogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public VanierLogo()
    {
        GreenfootImage image = getImage();
        image.scale(200,100);
        setImage(image);
    }
}
