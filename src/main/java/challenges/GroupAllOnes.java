package challenges;/*
Given a binary array data, return the minimum number of swaps required to group all 1’s present in the array together in any place in the array.



Example 1:

Input: data = [1,0,1,0,1], [1, 0, 0, 1, 1]
Output: 1
Explanation:
There are 3 ways to group all 1's together:
[1,1,1,0,0] using 1 swap. 100
[0,1,1,1,0] using 2 swaps.010
[0,0,1,1,1] using 1 swap. 001
The minimum is 1.
Example 2:

Input: data = [0,0,0,1,0]
Output: 0
Explanation:
Since there is only one 1 in the array, no swaps needed.

[1, 0, 1, 0]

[1, 1, 0, 0] 100
[0, 1, 1, 0] 010
[0, 0, 1, 1] 001


*/


import java.io.*;
// Main class should be named 'challenges.GroupAllOnes'

class GroupAllOnes {

    public static Integer findMinSwaps(int[] inputArr) {

        int count = 0;
        for(int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 1) {
                count++;
            }
        }

        int zeroCount = inputArr.length - count;

        Integer minSwaps = null;
        for(int l = 0; l < zeroCount + 1; l++) {

            int[] outPutArr = new int[inputArr.length ];

            for(int k = l; k < count + l; k++) {
                outPutArr[k] = 1;
            }

            int swaps = findSwaps(inputArr, outPutArr);
            if (minSwaps == null || swaps <  minSwaps) {
                minSwaps = swaps;
            }

        }

        return minSwaps;
    }

    private static Integer findSwaps(int[] inputArr, int[] outPutArr) {
        int count = 0;
        for(int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != outPutArr[i]) {
                count++;
            }
        }
        return count / 2;

    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1};
        int minSwaps = findMinSwaps(a);
        System.out.println(minSwaps);
    }
}
