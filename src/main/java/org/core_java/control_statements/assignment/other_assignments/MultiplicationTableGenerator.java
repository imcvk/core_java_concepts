package org.core_java.control_statements.assignment.other_assignments;

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + "*" + j + "=" + (number * j));
        }
    }
}
