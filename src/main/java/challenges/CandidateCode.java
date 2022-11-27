package challenges;

import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for(int i=0;i<noOfTestCases;i++) {
            int[] inputArr = {sc.nextInt(), sc.nextInt()
, sc.nextInt()};
           int noOfDays = calculateNoOfDays(inputArr, 1);
            System.out.println(noOfDays);
        }
   }

   private static int calculateNoOfDays(int[] inputArr, int output) {
       for(int i = inputArr[2]; i > 0;) {
           int t = i - inputArr[0];
           if (t > 0) {
               i = t + inputArr[1];
           } else break;
           output++;
       }
       return output;
   }
}