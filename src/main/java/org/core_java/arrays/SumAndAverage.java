package org.core_java.arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {78, 5, 62, 5, 86, 3, 45};

        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of element= " + sum);
        avg = sum / arr.length;
        System.out.println("Average of elements= " + avg);
    }
}
