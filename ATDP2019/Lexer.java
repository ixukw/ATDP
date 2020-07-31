import java.util.*;
public class Lexer { // Copy and pasted from my main project file.
  public String[] lexer(String input) {
    ArrayList<String> output = new ArrayList<String>();
    int i=0;
    String operators = "+-*/()^";
    while (i<input.length()) {
      String temp = input.substring(i, i+1);
      if (operators.indexOf(temp)!=-1) {
        output.add(temp);
        i++;
      } else {
        String temp2="";
        while (i<input.length() && operators.indexOf(input.substring(i, i+1))==-1) {
          temp2+=input.substring(i, i+1);
          i++;
        }
        output.add(temp2);
      }
      //System.out.println(output + ", " + i);
    }
    String[] actualOutput = new String[output.size()];
    for (int j=0; j<output.size(); j++) {
      actualOutput[j] = output.get(j);
    }
    return actualOutput;
  }
}
