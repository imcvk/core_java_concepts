package org.core_java.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35};
        List<Integer> maList = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i + 2] > arr.length)) {
                max = arr[i] * arr[i + 1] * arr[i + 2];
                maList.add(max);
            }
        }
        System.out.println(maList);
    }
}
