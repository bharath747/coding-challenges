package challenges.alternatingCharacters;

import java.io.IOException;
import java.util.Scanner;

public class SolutionAlternatingChars {

    private static int findAlternateChars(String s) {
        int count = 0;
        for (int i = 0; i <s.length() - 1 ; i++) {
           String currentChar = s.charAt(i) + "";
           String nextChar = s.charAt(i + 1) + "";
           if(currentChar.equals(nextChar)) {
               count++;
           }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count > 0) {
            System.out.println(findAlternateChars(sc.next()));
            count--;
        }
    }
}