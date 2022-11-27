package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintAllValidIps {

    // All the numbers in the IP address should be between 0 and 255

    // Example 1:

    // Input : "25525511135"
    // Output : [“255.255.11.135”, “255.255.111.35”]

    // Example 2:

    // Input : "25505011535"
    // Output : []
    // Output : ["25.50.50115.35"]

    // 12121
    // ["1.2.1.21", "1.2.12.1", "1.21.2.1", "12.1.2.1"]

    // 121212
    // 1.2.1.212, 1.2.12.12, 1.2.121.2, 1.21.2.12, 1.21.21.2, 1.212.1.2, 12.1.2.12, 12.1.21.2, 12.12.1.2, 121.2.1.2

    private static List<String> getIps(String ipString) {
        List<String> validIps = new ArrayList<>();

        int size = ipString.length();

        String snew = ipString;

        for (int i = 1; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    snew = snew.substring(0, k) + "." + snew.substring(k);
                    snew = snew.substring(0, j) + "." + snew.substring(j);
                    snew = snew.substring(0, i) + "." + snew.substring(i);

                    if(isValid(snew)) {
                        validIps.add(snew);
                    }

                    snew = ipString;
                }
            }
        }

        Collections.sort(validIps, new Comparator<String>() {
            public int compare(String o1, String o2)
            {
                String a1[] = o1.split("[.]");
                String a2[] = o2.split("[.]");

                int result = -1;
                for (int i = 0; i < 4 && result != 0; i++) {
                    result = a1[i].compareTo(a2[i]);
                }
                return result;
            }
        });

        return validIps;
    }

    private static boolean isValid(String ip)
    {
        String a[] = ip.split("[.]");
        for (String s : a) {
            int i = Integer.parseInt(s);
            if (s.length() > 3 || i < 0 || i > 255) {
                return false;
            }
            if (s.length() > 1 && i == 0)
                return false;
            if (s.length() > 1 && i != 0
                    && s.charAt(0) == '0')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(getIps("25525511135"));
    }
}