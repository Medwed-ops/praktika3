package task45;
import java.lang.*;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        this.radius = radius;
    }
    public String toString()
    {
     return "";
    }
    public void moveUp() {}
    public void moveDown() {}
    public void moveLeft() {}
    public void moveRight() {}
}
