package task45;
import java.lang.*;
public class MovableRectangle
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed) { }

    public String checkSpeed()
    {
        Movable c1 = new MovablePoint(10,10);
        Movable c2 = new MovablePoint(10,10);
        if(c1 == c2) {
            return "true";
        }
        else
        {
            return "false";
        }
    }
    public String toString()
    {
        return "ok";
    }
    public void moveUp() {}
    public void moveDown() {}
    public void moveLeft() {}
    public void moveRight() {}
}