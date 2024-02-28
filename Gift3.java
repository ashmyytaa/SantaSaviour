import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gift3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gift3 extends Actor
{
    public int counter = 0;
    /**
     * Act - do whatever the Gift3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 1);
       if (getY() > getWorld().getHeight() - getImage().getHeight()) 
       {
           getWorld().removeObject(this);
        }
    
    }    
    public Gift3()
    {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }
}
