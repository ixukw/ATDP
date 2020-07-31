public class ReverseString {
  public void printReverse(String a) {
    if (a.length()<=1) {
      System.out.print(a);
    } else {
      System.out.print(a.substring(a.length()-1));
      printReverse(a.substring(0, a.length()-1));
    }
  }
}
