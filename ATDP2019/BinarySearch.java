import java.util.*;
public class BinarySearch {
  public static void main (String[] args) {
    // This is just my tester feel free to remove it
    int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(Arrays.toString(x) + " searching for value 8:\n" + binarySearch(x, 8));

    int[] x2 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(Arrays.toString(x2) + " searching for value 11:\n" + binarySearch(x2, 11));

    int[] x3 = {0, 1, 2, 3};
    System.out.println(Arrays.toString(x3) + " searching for value 1:\n" + binarySearch(x3, 1));

    int[] x4 = {59, 303, 5943, 10024, 29456, 40067, 60000};
    System.out.println(Arrays.toString(x4) + " searching for value 40067:\n" + binarySearch(x4, 40067));

  }
  public static int binarySearch(int[] a, int value) {
    int lower = 0;
    int upper = a.length-1;
    int index = (int) Math.floor((int) (a.length/2));
    while (lower<upper) {
      index = (int) (lower + Math.floor((upper-lower+1)/2));
      //System.out.println("BEFORE:" + index + "; " + upper + "; " + lower + "; " + a[index] + "; " + value);
      if (a[index]==value) {
        return index;
      } else if (value>a[index]) {
        lower=index;
      } else {
        upper=index;
      }
      //System.out.println("AFTER:" + index + "; " + upper + "; " + lower);
    }
    return -1;
  }
}
