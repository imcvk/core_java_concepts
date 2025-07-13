package org.core_java.arrays;

public class SumAndAverageOfAllElementsIn_2DArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        long avg = 0;
        System.out.println("Average: " + sum / (a.length * a[0].length));
    }
}
