package challenges;

import java.util.Scanner;

public class CandidateCode4 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for(int i=0;i<noOfTestCases;i++) {
            int noOfDays = calculateNoOfDays(sc.nextInt(), sc.nextInt()
                    , sc.nextInt());
            System.out.println(noOfDays);
        }
    }

    private static int calculateNoOfDays(int c, int d, int n) {
        return (int)Math.ceil((double)(n - c) / (c-d)) + 1;
    }
}