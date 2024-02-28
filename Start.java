import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    GreenfootSound bgMusic1 = new GreenfootSound("Deck the Halls.wav");
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
        started();
        music();
    }    
      public Start()
    {
        GreenfootImage image = getImage();
        image.scale(600,500);
        setImage(image);
    }
    private void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Factory());
        }
    }
    private void music()
    {
        if (!bgMusic1.isPlaying() && Greenfoot.mouseClicked(this)) 
        {
            bgMusic1.playLoop();
            return;
        }else if (bgMusic1.isPlaying() && Greenfoot.mouseClicked(this))
        {
            bgMusic1.stop();
        }
    }
    public void started()
    {
        bgMusic1.playLoop();
    }
}
