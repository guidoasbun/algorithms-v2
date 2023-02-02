package io.asbun.TwoNumberSum;
import java.util.Arrays;
import java.util.HashMap;

class TwoNumberSum {

    public static int[] twoNumberSum1(int[] array, int targetSum) {
        //O(n^2) time | O(1) space
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int firstNumber = array[i];
            for (int j = i + 1; j < arrayLength; j++) {
                int secondNumber = array[j];
                if (firstNumber + secondNumber == targetSum) {
                    return new int[] {firstNumber, secondNumber};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // O(n) time | O(n) space
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (hashMap.containsKey(potentialMatch)) {
                return new int[] {potentialMatch, num};
            } else {
                hashMap.put(num, true);
            }
        }

        return new int[0];
    }

    public static int[] twoNumberSum3(int[] array, int targetSum) {
        // O(nlog(n)) time | O(1) space
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[] {array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else if (currentSum > targetSum) {
                right--;
            }
        }
        return new int[0];
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
