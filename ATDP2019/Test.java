import java.util.*;
public class Test {
  public static void main (String[] args) {
      System.out.println(Arrays.toString(maximumSubArray(new int[]{1, 2, 5, -2, 4, 6, 1}, 0, 6)));
  }
  public static int[] maximumSubArray(int[] a, int low, int high) {
    int x=0;
    int y=1;
    int lower=0;
    int upper=0;
    int c = Integer.MIN_VALUE;
    for (int i=0; i<a.length; i++) {
      x+=a[i];
      if (x>c) {
        lower=y;
        upper=i;
        c=x;
      }
      if (x<0) {
        x=0;
        y=i+1;
      }
    }
    return new int[]{lower, upper, c};
  }
}
