import javax.swing.JFrame;

public class ShapeViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 600);
      frame.setTitle("Shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Worksheet2D component = new Worksheet2D();
      frame.add(component);

      frame.setVisible(true);
   }
}
