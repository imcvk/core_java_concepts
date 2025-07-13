package org.core_java.arrays;

public class SearchAnElementIn_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int numToSearch = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == numToSearch) {
                    System.out.println("Found element at column " + j + " at row " + i);
                }
            }
        }

    }
}
