package core_java.arrays;

public class MergeTwoSortedArrays1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        mergeTwoSortedArrays(arr1, arr2);
    }
    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length + arr2.length;
        int[] arr3 = new int[arr1Length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }

        for (int i = 0; i < arr3.length; i++) {

            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] > arr3[j]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        printArray(arr3);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
