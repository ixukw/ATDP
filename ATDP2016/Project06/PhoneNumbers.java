public class PhoneNumbers
{
   /**
      Cleans a phone number.
      @param phoneNumber a phone number that should contain ten digits and possibly other characters
      @return the phone number in the form (###) ###-#### or the string "Error" if phoneNumber
      does not have ten digits
   */
   public String cleanNumber(String phoneNumber)
   {   
      // your work here
     int i = 0;
     String phoneNumberQ = "";
      while (i <= phoneNumber.length()) {
      {
         char ch = phoneNumber.charAt(i);
         if (Character.isDigit(ch))
         {
            int extractIndex = phoneNumber.indexOf(ch);
            String phoneComponent = phoneNumber.substring(extractIndex, extractIndex + 1);
            
            phoneNumberQ += phoneComponent;
            i++;
         } else {
            
         }
      }
      i++;
      return phoneNumber;
     } 
     return phoneNumber;
   }
}