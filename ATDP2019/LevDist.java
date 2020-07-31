public class LevDist {
  public static int calculateLevenDistance(String input, String input2) {
    int[][] a = new int[input.length()+1][input2.length()+1];
    for (int i=0; i<a.length; i++) {
      a[i][0]=i;
    }
    for (int i=0; i<a[0].length; i++) {
      a[0][i]=i;
    }
    for (int i=1; i<a.length; i++) {
      for (int j=1; j<a[i].length; j++) {
        int s=1;
        if (input.charAt(i-1)==input2.charAt(j-1)) {
          s=0;
        }
        int x=a[i-1][j]+1;
        int y=a[i][j-1]+1;
        int z=a[i-1][j-1]+s;
        if (x<=y && x<=z) {
          a[i][j]=x;
        } else if (y<=z && y<=x) {
          a[i][j]=y;
        } else {
          a[i][j]=z;
        }
      }
    }
    return a[input.length()-1][input2.length()-1];
  }
  public static void main (String[] args) {
    System.out.println(calculateLevenDistance("sitting", "kitten"));
    System.out.println(calculateLevenDistance("sunday", "saturday"));
    System.out.println(calculateLevenDistance("aaaardvark", "Aardvark"));


  }
}
