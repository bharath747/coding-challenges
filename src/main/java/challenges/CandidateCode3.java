package challenges;

import java.util.Scanner;

public class CandidateCode3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfPeople = sc.nextInt();

        if (noOfPeople <= 100) {
            System.out.println(0 + " No Fine");
        } else if (noOfPeople > 100 && noOfPeople <= 200) {
            int fine = (noOfPeople - 100) * 500;
            System.out.println(fine + " Warning");
        } else {
            int fine = (noOfPeople - 100) * 1000;
            System.out.println(fine + " Register Case");
        }
    }

}