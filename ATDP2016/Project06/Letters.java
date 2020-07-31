public class Letters
{
   /**
      Counts the frequencies of letters A-Za-z in a string
      @param str a string
      @return an array of 26 counts. The i-th count is the number of occurrences
      of 'A' + i or 'a' + i.
   */
   public int[] letterFrequencies(String str)
   {
       int A1 =0;
       int B1=0;
       int C1 =0;
       int D1=0;
       int E1 =0;
       int F1 =0;
       int G1=0;
       int H1=0;
       int I1=0;
       int J1=0;
       int K1=0;
       int L1=0;
       int M1=0;
       int N1=0;
       int O1=0;
       int P1=0;
       int Q1=0;
       int R1=0;
       int S1=0;
       int T1=0;
       int U1=0;
       int V1=0;
       int W1=0;
       int X1 = 0;
       int Y1 = 0;
       int Z1 = 0;
       
       for (int i = 0; i <=str.length(); i++) {
           if (str.indexOf("A") > i || str.indexOf("a") > i) {
               A1++;
           } else if (str.indexOf("B") > i || str.indexOf("b") > i) {
               B1++;
           } else if (str.indexOf("C") > i || str.indexOf("c") > i) {
               C1++;
           } else if (str.indexOf("D") > i || str.indexOf("d") > i) {
               D1++;
           } else if (str.indexOf("E") > i || str.indexOf("e") > i) {
               E1++;
           } else if (str.indexOf("F") > i || str.indexOf("f") > i) {
               F1++;
           } else if (str.indexOf("G") > i || str.indexOf("g") > i) {
               G1++;
           } else if (str.indexOf("H") > i || str.indexOf("h") > i) {
               H1++;
           } else if (str.indexOf("I") > i || str.indexOf("i") > i) {
               I1++;
           } else if (str.indexOf("J") > i || str.indexOf("j") > i) {
               J1++;
           } else if (str.indexOf("K") > i || str.indexOf("k") > i) {
               K1++;
           } else if (str.indexOf("L") > i || str.indexOf("l") > i) {
               L1++;
           } else if (str.indexOf("M") > i || str.indexOf("m") > i) {
               M1++;
           } else if (str.indexOf("N") > i || str.indexOf("n") > i) {
               N1++;
           } else if (str.indexOf("O") > i || str.indexOf("o") > i) {
               O1++;
           } else if (str.indexOf("P") > i || str.indexOf("p") > i) {
               P1++;
           } else if (str.indexOf("Q") > i || str.indexOf("q") > i) {
               Q1++;
           } else if (str.indexOf("R") > i || str.indexOf("r") > i) {
               R1++;
           } else if (str.indexOf("S") > i || str.indexOf("s") > i) {
               S1++;
           } else if (str.indexOf("T") > i || str.indexOf("t") > i) {
               T1++;
           } else if (str.indexOf("U") > i || str.indexOf("u") > i) {
               U1++;
           } else if (str.indexOf("V") > i || str.indexOf("v") > i) {
               V1++;
           } else if (str.indexOf("W") > i || str.indexOf("w") > i) {
               W1++;
           } else if (str.indexOf("X") > i || str.indexOf("x") > i) {
               X1++;
           } else if (str.indexOf("Y") > i || str.indexOf("y") > i) {
               Y1++;
           } else if (str.indexOf("Z") > i || str.indexOf("z") > i) {
               Z1++;
           }

       }
       
       
       
       int[] alphabet = {A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1};
       
       return alphabet;
 
   }
}
