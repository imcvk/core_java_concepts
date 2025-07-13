package org.core_java.control_statements.assignment;

import java.util.Scanner;

//Create a program to find if the given number is even or odd.
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("No is even");
        } else {
            System.out.println("No is odd");
        }

    }
}
