import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treee extends Actor
{
    /**
     * Act - do whatever the Treee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }  
      public Treee()
    {
        GreenfootImage Tree = getImage();
        Tree.scale(Tree.getWidth()-630, Tree.getHeight()-750);
        setImage(Tree);
    }
}
