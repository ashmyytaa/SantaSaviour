import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    GreenfootSound bgGameOver = new GreenfootSound("prologue.mp3");
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    private void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Factory());
        }
    }
        public Restart()
    {
        GreenfootImage image = getImage();
        image.scale(2000,1000);
        setImage(image);
    }
    
    private void music()
    {
        if (!bgGameOver.isPlaying() && Greenfoot.mouseClicked(this)) 
        {
            bgGameOver.playLoop();
            return;
        }else if (bgGameOver.isPlaying() && Greenfoot.mouseClicked(this))
        {
            bgGameOver.stop();
        }
    }
}
