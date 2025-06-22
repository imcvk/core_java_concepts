package core_java.arrays;

/*
 * Given an array of positive integers arr[] of size n, the task is to find second
 * largest distinct element in the array.
 * */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35};
//        int[] arr = {12, 12, 12, 12};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println("Largest: " + arr[0]);
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
//            if (temp == arr[i + 1]) {
//                temp = arr[i + 1];
//            }
            if (temp != arr[i + 1]) {
                temp = arr[i + 1];
                break;
            }
        }
        if (temp != 0) {
            System.out.println("Second largest: " + temp);
        } else {
            System.out.println("Second largest does not exist.");
        }
    }
}

