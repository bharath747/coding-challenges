package challenges.validString;

import java.io.IOException;
import java.util.Scanner;

public class SolutionValidString {
    private static String isValidString(String s) {
        int[] str = new int[(int) 'z'];
        for (int i = 0; i <s.length(); i++) {
           str[(int) s.charAt(i)] = str[(int) s.charAt(i)] + 1;
        }

        int start = (int) 'a';
        int end = (int) 'z';
        for (int i = start; i <=end; i++) {
            if(str[i] > 0) {

            }

        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(isValidString(sc.next()));
    }
}