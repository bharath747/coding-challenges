package challenges;

import java.util.Scanner;

public class Calculator {
    private static String[] modules = new String[]{"1. Sqrt", "2. Log", "3. Factorial"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the simple math helper.\n" + "What would you like to calculate?");
        for (String module : modules) {
            System.out.println(module);
        }

        int moduleId = sc.nextInt();

        switch (moduleId) {
            case 1 :
                System.out.println("Enter the number to find sqrt:");
                int sqNumber = sc.nextInt();
                System.out.println(Math.sqrt(sqNumber));
                break;
            case 2 :
                System.out.println("Enter the number to find Log:");
                int lgNumber = sc.nextInt();
                System.out.println(Math.log(lgNumber));
                break;
            case 3 :
                System.out.println("Enter the number to find Factorial:");
                int fcNumber = sc.nextInt();
                System.out.println(factorial(fcNumber));
                break;
            default:
                System.out.println("Please enter either 1 to find Sqrt or 2 to find Log or 3 to find Factorial");
                break;
        }

    }

    private static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}