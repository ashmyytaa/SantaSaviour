import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Sac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sac extends Actor
{
    /**
     * Act - do whatever the Sac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        Actor Gift1;
        Gift1 = getOneObjectAtOffset(0, 0, Gift1.class);
        if (Gift1!=null)
        {
            Factory factory = (Factory)getWorld();
            factory.removeObject(Gift1);
            Counter counter = factory.getCounter();
            counter.bumpCount(1);
        }
        Actor Gift2;
        Gift2 = getOneObjectAtOffset(0, 0, Gift2.class);
        if (Gift2!=null)
        {
            Factory factory = (Factory)getWorld();
            factory.removeObject(Gift2);
            Counter counter = factory.getCounter();
            counter.bumpCount(1);
        }
        Actor Gift3;
        Gift3 = getOneObjectAtOffset(0, 0, Gift3.class);
        if (Gift3!=null)
        {
            Factory factory = (Factory)getWorld();
            factory.removeObject(Gift3);
            Counter counter = factory.getCounter();
            counter.bumpCount(1);
        }
    }    
    public void moveRight()
    {
        setLocation(getX()+4, getY());
    }
    public void moveLeft()
    {
        setLocation(getX()-4, getY());
    }
    public Sac()
    {
        super();
        GreenfootImage image = getImage();
        image.scale(500,400);
        setImage(image);
    }
}
