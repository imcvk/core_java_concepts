package org.core_java.control_statements.assignment.other_assignments;

public class ElementOccurrenceCounter {
    public static void main(String[] args) {
        int[] arr = {45, 85, 65, 6, 5, 2, 6, 2, 1, 5, 2, 3, 852, 3, 2};
        int num = 2;
        int c = 0;
        for (int i : arr) {
            if (i == num) {
                c++;
            }
        }
        System.out.println("Number " + num + " occurred " + c + " times");
    }
}
