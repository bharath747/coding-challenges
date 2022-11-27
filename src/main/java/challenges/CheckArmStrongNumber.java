package challenges;

import java.util.Scanner;

public class CheckArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for(int i=0;i<noOfTestCases;i++) {
            boolean isArmStrongNumber = isArmStrongNumber(sc.nextInt());
            if (isArmStrongNumber) {
                System.out.println("It is an ARMSTRONG number");
            } else {
                System.out.println("It is NOT an ARMSTRONG number");
            }
        }

    }

    private static boolean isArmStrongNumber(int input) {
        int number = input;
        Double sum = 0D;
        while (number > 0) {
            sum = sum + Math.pow(number % 10, 3);
            number = number / 10;
        }
        return sum == input;
    }
}