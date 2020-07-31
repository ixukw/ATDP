public class Inputs
{
   private int max;
    /**
      Gets the choice that the user provided, or null if the 
      user didn't provide a valid choice.
      @param input the user input
      @param maxChoice the maximum valid choice, e.g. D1 if there
      are four choices.
      @return the user input if it was a valid choice (i.e. length 1
      and between A1 and maxChoice), null otherwise
   */
   public String getChoice(String input, String maxChoice)
   {
       String invalid = null;
       String userinput;
       
       String A1 = "A";
       String B1 = "B";
       String C1 = "C";
       String D1 = "D";
       if (maxChoice == D1) {
           max = 4;
       } else if (maxChoice == C1) {
           max = 3;
       } else if (maxChoice == B1) {
           max = 2;
       } else if (maxChoice == A1) {
           max = 1;
       } else {
           return invalid;
       }
       
       if (input.isEmpty()) {
           return invalid;
       }
       
       if (max == 4) {
           if (input == D1 || input == C1 || input == B1 || input == A1) {
               return input;
           } else {
               return invalid;
           }
       } else if (max == 3) {
           if (input == C1 || input == B1 || input == A1) {
               return input;
           } else {
               return invalid;
           }
       }
       else if (max == 2) 
       {
           if (input == B1 || input == A1) {
               return input;
           } else {
               return invalid;
           }
       }
       else 
       {
           if (input == A1) {
               return input;
           } else {
               return invalid;
           }
       }
   }
}