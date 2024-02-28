import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int totalCount = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Counter() 
    {
        setImage(new GreenfootImage("Stars: " + totalCount, 40, Color.BLUE , Color.RED));
    }  
    public void act(){
        
    }
    public void caughtCount(int amount) 
    {
        totalCount += amount;
        setImage(new GreenfootImage("Stars: " + totalCount, 40, Color.BLUE, Color.RED));
    }
}
        

