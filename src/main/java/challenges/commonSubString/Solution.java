package challenges.commonSubString;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String main = s1.length() >= s2.length() ? s1 : s2;
        String child = s1.length() < s2.length() ? s1 : s2;

       String usedStr = "";

        for (int i = 0; i <child.length() ; i++) {
            String str = "" + child.charAt(i);

            if (usedStr.contains(str)) {
                continue;
            }
            if(main.contains(str)) {
                return "YES";
            }
            usedStr = usedStr + str;
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count > 0) {
            System.out.println(twoStrings(sc.next(), sc.next()));
            count--;
        }
    }
}
