package challenges;

import java.util.HashMap;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] arr2 = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        int[] arr3 = new int[]{2, 3, 4, 5};
        int[] arr4 = new int[]{2, 5, 5, 2, 3, 5, 1, 2, 4};

        System.out.println(findFirstRecurringCharacter(arr3));
    }

    private static Integer findFirstRecurringCharacter(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length ; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 0);
            } else {
               return array[i];
            }
        }
        return null;
    }
}