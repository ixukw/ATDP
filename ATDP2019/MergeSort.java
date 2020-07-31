import java.util.*;
public class MergeSort {
  public void mergeSort(int[] a, int lower, int upper) {
    if (lower<upper) {
      int mid = lower+(upper-lower)/2;
      mergeSort(a, lower, mid);
      mergeSort(a, mid+1, upper);
      merge(a, lower, mid, upper);
    }
  }
  public void merge(int[] a, int p, int q, int r) {
    int s = q+1;
    if (a[q]<=a[s]) {
      return;
    }
    while (p<=q&&s<=r) {
      if (a[p]<=a[s]) {
        p++;
      } else {
        int temp = a[s];
        int i = s;
        while (i!=p) {
          a[i]=a[i-1];
          i--;
        }
        a[p]=temp;
        p++;
        q++;
        s++;
      }
    }
  }
}
