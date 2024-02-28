import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverText extends Actor
{
    /**
     * Act - do whatever the OverText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
      public OverText()
    {
        GreenfootImage image = getImage();
        image.scale(1000,900);
        setImage(image);
    }
}
