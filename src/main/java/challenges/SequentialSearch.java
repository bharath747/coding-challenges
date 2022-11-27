package challenges;

public class SequentialSearch {

    public static void main(String[] args) {
        int array[] = new int[]{2, 3, 8, 15, 20, 26, 28, 32, 34, 45, 50};
        int key = 28;

        int index = sequentialSearch(array, key);

        if (index == -1) {
            System.out.println("The number is not found in the given array");
        } else {
            System.out.println("The number " + key + " is present at index " + index);
        }
    }

    private static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}