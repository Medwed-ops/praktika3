package task123;

import java.lang.*;

public class Square extends Rectangle
{
    private double side;
    public Square()
    {
        side = 0.0;
    }
    public Square(double side,String color,boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public Square(double side)
    {
        this.side = side;
        color = "white";
        filled = false;
    }

    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public void setWidth(double side)
    {
        this.side = side;
    }
    @Override
    public void setLength(double side)
    {
        this.side = side;
    }
    @Override
    public String toString()
    {
        return "Shape: square, width: "+this.width+ ", length: " + this.length +", color: "+this.color;
    }
}
