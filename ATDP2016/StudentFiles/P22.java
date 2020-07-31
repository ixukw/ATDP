import java.awt.Rectangle;
public class P22
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(100, 100, 50, 50);
        System.out.println("Xpos: " + box.getX());
        System.out.println("Ypos: " + box.getY());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        box.grow(0,0);
        System.out.println("Xpos: " + box.getX());
        System.out.println("Ypos: " + box.getY());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
    }
}
        