package challenges;

import java.util.Scanner;

public class CandidateCode1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String inputRev = new StringBuilder(input).reverse().toString();
        String output = "";
        for (Character character : inputRev.toCharArray()) {
            output = output + fetchComplement(character);
        }
        System.out.println(output);
    }

    private static Character fetchComplement(Character symbol) {
        Character complement = null;
        switch (symbol) {
            case 'A' :
                complement = 'T';
                break;
            case 'T' :
                complement = 'A';
                break;
            case 'C' :
                complement = 'G';
                break;
            case 'G' :
                complement = 'C';
                break;

        }
        return complement;
    }
}