package task123;
import java.lang.*;

public abstract class Shape
{
    protected String color;
    protected boolean filled;
    public Shape(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public Shape()
    {
        color = "white";
        filled = false;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public  boolean isFilled()
    {
        return filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
