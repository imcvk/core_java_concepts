package org.core_java.control_statements.assignment.other_assignments;

public class PositiveNumberSummer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -10, 5, -4, 6, 7, 8, 9, -100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                continue;
            } else {
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
