import javax.swing.JFrame;

public class OrangeRectViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      //did not understand too well.
      frame.setSize(300, 400);
      frame.setTitle("Two OrangeRects!");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OrangeRectComponent component = new OrangeRectComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
