package org.core_java.control_statements.assignment.other_assignments;

import java.util.Scanner;

public class InputReaderWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Continue to enter :");
            }
        }
        System.out.println("Loop broke...");
    }
}
