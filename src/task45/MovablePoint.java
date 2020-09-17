package task45;
import java.lang.*;

public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(int xSpeed,int ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
