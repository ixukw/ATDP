import java.awt.Rectangle;
/**
 * Write a description of class x here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E25
{
   public static void main(String[] args)
   {
       Rectangle box = new Rectangle(5, 10, 20, 30);
       box.add(0, 0);
       System.out.println(box.getWidth());
       System.out.println(box.getHeight());
    }
}
       