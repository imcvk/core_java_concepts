package org.core_java.control_statements.assignment.other_assignments;

public class MaxValueFinder {
    public static void main(String[] args) {
        int[] arr = {78, 45, 68, 4, 5, 2, 1, 788, 522, 2, 1};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max value is: " + max);
    }
}
