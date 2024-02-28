import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Santa extends Actor
{
    /**
     * Act - do whatever the Santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act() 
    {
       //move (4); 
        if (Greenfoot.isKeyDown("left")) {
        turn (-3);
    }
        if (Greenfoot.isKeyDown("right")) {
        turn (3);    
    }    
    if (Greenfoot.isKeyDown("up")) {
        move (10);
    }
    if (Greenfoot.isKeyDown("down")) {
        move (-10);
    }
   }
    public Santa()
    {
        GreenfootImage image = getImage();
        image.scale(70,50);
        setImage(image);
   }
}
