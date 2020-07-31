import java.util.*;
public class CookieMonster {
  public static void main(String[] args) {
    cookie("");
  }
  public static String cookie(String input) {
    if (input.equalsIgnoreCase("COOKIE")) {
      return "";
    }
    System.out.println("GIVE ME A COOKIE");
    Scanner scan = new Scanner(System.in);
    return cookie(scan.next());
  }
}
