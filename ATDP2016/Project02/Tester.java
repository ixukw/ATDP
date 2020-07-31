/**
 * Have a brief conversation with the user.
 * 
 * @author Inan Xu
 * @version Summer 2016
 */

public class Tester
{
  public static void main(String[] args)
  {
    String river = "Mississippi";
    String greeting = "Hello, World?";
    
    river.replace("p", "s");
    System.out.println("\n" + river);
    
    greeting.replace("World", "Dave").length();
    System.out.println("\n" + greeting);
    
  }
}
