import java.util.*;
public class ShuntingYardAlgorithm {
  public double calculateExpression(String expression) {
    return evaluate(shuntingYard(lexer(expression)));
  }
  public String[] lexer(String input) {
    ArrayList<String> output = new ArrayList<String>();
    String operators = "+-*/()^";
    int i=0;
    while (i<input.length()) {
      String temp = Character.toString(input.charAt(i));
      if (operators.indexOf(temp)==-1 || (temp.equals("-") && operators.indexOf(input.charAt(i-1))!=-1 && !Character.toString(input.charAt(i-1)).equals(")"))) {
        i++;
        while (i<input.length() && operators.indexOf(input.charAt(i))==-1) {
          temp+=input.charAt(i);
          i++;
        }
      } else {
        i++;
      }
      output.add(temp);
    }
    return output.toArray(new String[output.size()]);
  }

  public String[] shuntingYard(String[] input) {
    Stack<String> s = new Stack<String>();
    ArrayList<String> output = new ArrayList<String>();
    String operators = "^*/+-";
    for (int i=0; i<input.length; i++) {
      if (operators.indexOf(input[i])==-1 && !input[i].equals("(") && !input[i].equals(")")) {
        output.add(input[i]);
      } else if (operators.indexOf(input[i])!=-1) {
        while (s.peek()!=null && checkPrecLvl(precLvl(s.peek()), precLvl(input[i]))) {
          output.add(s.pop());
        }
        s.push(input[i]);
      } else if (input[i].equals("(")) {
        s.push(input[i]);
      } else if (input[i].equals(")")) {
        while (s.peek()!=null && !s.peek().equals("(")) {
          output.add(s.pop());
        }
        if (s.peek()!=null && s.peek().equals("(")) {
          s.pop();
        }
      }
    }
    while (s.peek()!=null) {
      output.add(s.pop());
    }
    return output.toArray(new String[output.size()]);
  }
  private int precLvl(String a) {
    if (a.equals("+") || a.equals("-")) {
      return 1;
    } else if (a.equals("*") || a.equals("/")) {
      return 2;
    } else if (a.equals("^")) {
      return 3;
    }
    return 0;
  }
  private boolean checkPrecLvl(int a, int b) {
    if (a==3 && b==3) {
      return false;
    } else if (a>=b) {
      return true;
    }
    return false;
  }

  public double evaluate(String[] input) {
    String operators = "+-/^*";
    Stack<String> s = new Stack<String>();
    for (int i=0; i<input.length; i++) {
      if (operators.indexOf(input[i])!=-1) {
        double second = Double.parseDouble(s.pop());
        double first = Double.parseDouble(s.pop());
        double value = Integer.MIN_VALUE;
        if (input[i].equals("+")) {
          value = first+second;
        } else if (input[i].equals("-")) {
          value = first-second;
        } else if (input[i].equals("*")) {
          value = first*second;
        } else if (input[i].equals("/")) {
          value = first/second;
        } else if (input[i].equals("^")) {
          value = Math.pow(first, second);
        }
        s.push(Double.toString(value));
      } else {
        s.push(input[i]);
      }
    }
    return Double.parseDouble(s.pop());
  }
}
