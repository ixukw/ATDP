import java.util.*;
public class Project1 {
  public static void main(String[] args) {
    String[] t = {"3+5-4", "3.4315-(-5.5)^(-5)-5.2", "3+4*2/(1-5)^2^3", "15/(7-(1+1))*3-(2+(1+1))", "1*(2+3*4)+5"};
    ShuntingYardAlgorithm a = new ShuntingYardAlgorithm();
    for (int i=0; i<t.length; i++) {
      System.out.println(a.calculateExpression(t[i]));
    }
  }
}
