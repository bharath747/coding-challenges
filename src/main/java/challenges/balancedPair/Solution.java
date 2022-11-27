package challenges.balancedPair;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    static boolean isOpen(String str) {
        if(str.equals("[") || str.equals("{") || str.equals("(")) {
            return true;
        }
        return false;
    }

    static boolean isComplete(String open, String closed) {
        String str = open + closed;
        if(str.equals("[]") || str.equals("{}") || str.equals("()")) {
            return true;
        }
        return false;
    }

    // Complete the twoStrings function below.
    static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i <s.length() ; i++) {
            String now = s.charAt(i) + "";

            if(isOpen(now)) {
                stack.push(now);
            } else {
                boolean isBalanced = false;
                if(stack.size() > 0) {
                    String open = stack.peek();
                    isBalanced = isComplete(open, now);
                }
               if(!isBalanced) {
                   return "NO";
               } else {
                    stack.pop();
               }

            }
        }
        return stack.size() == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count > 0) {
            System.out.println(isBalanced(sc.next()));
            count--;
        }
    }
}
