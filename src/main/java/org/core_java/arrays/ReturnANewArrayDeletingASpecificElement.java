package org.core_java.arrays;

public class ReturnANewArrayDeletingASpecificElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int newArr[] = deleteElementFromArray(arr, 4);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] deleteElementFromArray(int[] arr, int elementToDelete) {
        int o = findOccurrences(arr, elementToDelete);
        int[] newArr = new int[arr.length - o];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToDelete) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static int findOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
