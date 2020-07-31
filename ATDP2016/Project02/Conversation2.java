/**
 * Have a brief conversation with the user.
 * 
 * @author 2 people 
 * @version Summer 2016
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("Well hello there, what is your name?"); // Ask user
    String name = kboard.nextLine();         // Accept answer from user
    System.out.println("Hello, " + name);  
    
    
    System.out.print("\nHow many fingers do you have? "); // Ask user
    int numOfFingers = kboard.nextInt();              // Accept answer from user
    System.out.println("\n Wow! You have " + numOfFingers + " fingers.");
   
        
    System.out.print("\nHow far away is the nearest BART station from here? (in miles) "); // Ask user
    double disttoBART = kboard.nextDouble();              // Accept answer from user
    System.out.println("I suppose I will start walking " + disttoBART + " miles to the nearest station now.");  
    
    kboard.close(); // Done using the keyboard
  }
}
