import java.awt.geom.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Draws 1 circle. Subclass of Ellipse2D.Double.
 * 
 * @author Inan Xu
 * @version v1.0.0
 */
public class Circle extends Ellipse2D.Double
{
    private Ellipse2D.Double circle;
    public Circle(int centerX, int centerY, int radius)
    {
        circle = new Ellipse2D.Double(centerX, centerY, radius, radius);
    }
    
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.draw(circle);
    }
}
