package challenges;

import java.util.Scanner;

public class CandidateCode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer testCases = sc.nextInt();

        int[] totalTeams = new int[testCases];
        for (int i=0; i< testCases; i++) {
            totalTeams[i] = sc.nextInt();
        }

        for (int i=0; i< testCases; i++) {
            System.out.println(fetchNumberOfMatches(totalTeams[i]));
        }
    }

    private static int fetchNumberOfMatches(int noOfTeams) {
        int totalTeams = noOfTeams;
        int matches = 0;
        while (totalTeams > 1) {
            int matchesPlayed = fetchEvenMatchCount(totalTeams);
            matches = matches + matchesPlayed;
            totalTeams = (totalTeams % 2) + matchesPlayed;
        }
        return matches;
    }

    private static int fetchEvenMatchCount(int evenTeamCount) {
        return evenTeamCount / 2;
    }


}