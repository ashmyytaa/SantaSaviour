import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowflake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowflake extends Actor
{
    
    /**
     * Act - do whatever the Snowflake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World w = getWorld();
        move(-4);
        if (isTouching(Santa.class)) {
            removeTouching(Santa.class);
        }
        
        if(isAtEdge())
        {
            setLocation(800, getY());
        }    
    }

}
