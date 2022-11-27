package challenges;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 11, 18, 24, 28};
        int[] arr2 = new int[]{6, 8, 12, 15, 20};

        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        for (int l = 0; l < mergedArray.length ; l++) {
            System.out.println(mergedArray[l]);
        }
    }
}