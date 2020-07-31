import java.util.Scanner;
/**
 * Tests the String Class
 * 
 * @author Inan 
 * @version Project Version 1.0..0_ALPHA
 */
public class StringChecker
{
    public static void main (String[] args)
    {
        String numericStr = "0123456789";
        System.out.println("NumericStr: " + numericStr);
        System.out.println("Length of NumericStr: " + numericStr.length());
        System.out.println("SUBSTRING 0, 3: " + numericStr.substring(0, 3));
        System.out.println("SUBSTRING 1, 5: " + numericStr.substring(1, 5));
        
        System.out.println();
        
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Hey! Type something with 4 words! ");
        //String coName = reader.next();
        
        String coName = "United States of America ";
        System.out.println("CoName: " + coName);
        
       
        int blank1Loc = coName.indexOf(" ");
        String word1 = coName.substring(0, blank1Loc);
        System.out.println("Word1: " + word1);
        
        int blank2Loc = coName.indexOf(" ", blank1Loc + 1);
        System.out.println("Blank2Loc: " + blank2Loc);
        String word2 = coName.substring(blank1Loc + 1, blank2Loc);
        System.out.println("Word2: " + word2);
        
        int blank3Loc = coName.indexOf(" ", blank2Loc + 1);
        System.out.println("Blank3Loc: " + blank3Loc);
        String word3 = coName.substring(blank2Loc + 1, blank3Loc);
        System.out.println("Word3: " + word3);
        
        int blank4Loc = coName.indexOf(" ", blank3Loc + 1);
        System.out.println("Blank4Loc: " + blank4Loc);
        String word4 = coName.substring(blank3Loc + 1, blank4Loc);
        System.out.println("Word4: " + word4);
        
        System.out.println("");
        char cAt2 = coName.charAt(2);
        System.out.println("cAt2: " + cAt2);
        
        System.out.println("");
        String newCo = coName.replace("me", "you");
        System.out.println("After Replace (coName): " + coName);
        System.out.println("After Replace (newCo): " + newCo);
       
    }
}
