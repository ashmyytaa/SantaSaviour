import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color.*;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int totalCount = 0;
    public Counter()
    {
        setImage(new GreenfootImage("Presents: " + totalCount, 40, Color.BLACK, Color.RED));
    }
    public void act() 
    {
      
    }
    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("Presents: " + totalCount, 40, Color.BLACK, Color.RED));
    }
    
}
