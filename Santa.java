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
        move(); // calling the move method 
        eat();
        

    }
public void move()
    { 
        if(Greenfoot.isKeyDown("Up")) 
      {
           setLocation(getX(), getY()-10);
      }
      if(Greenfoot.isKeyDown("Down"))
      {
           setLocation(getX(), getY()+10);
      }
    }   
public void eat()
    {
        Actor star = getOneIntersectingObject(Star.class);
        if (star != null){
            World santaBackground = getWorld();
            santaBackground.removeObject(star); 
            Counter counter = santaBackground.getCounter();
            counter.caughtCount(1);
         
        }
    }
}