package org.core_java.arrays;

public class CheckIfGivenArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        if (isInDecreasingOrder(arr) || isInIncreasingOrder(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }

    public static boolean isInIncreasingOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInDecreasingOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
