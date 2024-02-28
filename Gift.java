import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gift extends Actor
{
    /**
     * Act - do whatever the Gift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Gift() {
        GreenfootImage Gift = getImage();
        Gift.scale(Gift.getWidth()-730, Gift.getHeight()-750);
        setImage(Gift);
    }
        public void act() 
    {
    if (isTouching(Santa.class)) {
        Greenfoot.setWorld(new WinWorld());
    }
    }
}
