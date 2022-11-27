package challenges;

import java.util.Scanner;

public class TGThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i <arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] largestThree = new int[3];
        for (int i = 0; i <arrSize ; i++) {
            int num = arr[i];
            if (num > largestThree[0]) {
                largestThree[0] = num;
            } else if (num > largestThree[1]) {
                largestThree[1] = num;
            } else if (num > largestThree[1]) {
                largestThree[2] = num;
            }
        }

        System.out.println(largestThree[2]);

    }
}