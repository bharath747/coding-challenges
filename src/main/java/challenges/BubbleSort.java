package challenges;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[]{6, 4, 9, 7, 8, 3};

        int[] sortedArr = bubbleSort(arr);

        System.out.println("Sorted Array in Ascending order : ");
        for (int k = 0; k < sortedArr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}