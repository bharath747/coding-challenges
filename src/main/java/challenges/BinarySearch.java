package challenges;

public class BinarySearch {

    public static void main(String[] args) {
        int sortedArray[] = new int[]{2, 3, 8, 15, 20, 26, 28, 32, 34, 45, 50};
        int key = 28;
        int low = 0;
        int high = sortedArray.length - 1;

        int index = binarySearch(sortedArray, key, low, high);

        if (index == -1) {
            System.out.println("The number is not found in the given array");
        } else {
            System.out.println("The number " + key + " is present at index " + index);
        }
    }

    private static int binarySearch(int[] sortedArray, int key, int low, int high) {
        int middle = (low  + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }
}