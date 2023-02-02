package io.asbun.TwoNumberSum;

public class Test {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        // int[] array2 = {4, 6};
        // int targetSum2 = 10;

        // int[] array3 = {4, 6, 1};
        // int targetSum3 = 5;

        // int[] array4 = {4, 6, 1, -3};
        // int targetSum4 = 3;

        // int[] array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int targetSum5 = 17;

        int[] result = TwoNumberSum.twoNumberSum1(array, targetSum);
        int[] result2 = TwoNumberSum.twoNumberSum2(array, targetSum);
        int[] result3 = TwoNumberSum.twoNumberSum3(array, targetSum);

        System.out.print("Solution 1: ");
        TwoNumberSum.print(result);
        System.out.print("Solution 2: ");
        TwoNumberSum.print(result2);
        System.out.print("Solution 3: ");
        TwoNumberSum.print(result3);
    }
}
