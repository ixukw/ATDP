import java.util.Scanner;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Write a description of class OlympicLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OlympicLogo
{
    private Graphics g;
    public OlympicLogo(Graphics pg)
    {
        g = pg;
    }
    
    public void createOlympicLogo(int x, int y, int topMiddleRadius) {
        g.setColor(Color.BLACK);
        Circle aCircle = new Circle(x, y, topMiddleRadius);
        aCircle.paint(g);
        
        g.setColor(Color.BLUE);
        Circle aCircle2 = new Circle(x - topMiddleRadius - topMiddleRadius / 5, y, topMiddleRadius);
        aCircle2.paint(g);
        
        g.setColor(Color.RED);
        Circle aCircle3 = new Circle(x + topMiddleRadius + topMiddleRadius / 5, y, topMiddleRadius);
        aCircle3.paint(g);
        
        g.setColor(Color.GREEN);
        Circle aCircle4 = new Circle(x + topMiddleRadius / 3 + topMiddleRadius / 5, y + topMiddleRadius / 2, topMiddleRadius);
        aCircle4.paint(g);
        
        g.setColor(Color.YELLOW);
        Circle aCircle5 = new Circle(x - topMiddleRadius / 3 - topMiddleRadius / 5, y + topMiddleRadius / 2, topMiddleRadius);
        aCircle5.paint(g);
    }
}
