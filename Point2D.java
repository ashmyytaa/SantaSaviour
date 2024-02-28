/**
 * Write a description of class Point2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point2D  
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    
    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D other)
    {
        this.x = other.x;
        this.y = other.y;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setX(double value)
    {
        x = value;
    }
    
    public void setY(double value)
    {
        y = value;
    }

    public void add(Vector2D v)
    {
        x += v.getX();
        y += v.getY();
    }    
}
