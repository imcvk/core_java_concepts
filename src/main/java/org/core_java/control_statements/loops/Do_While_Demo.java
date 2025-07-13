package org.core_java.control_statements.loops;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        while (age <= 0 || age >= 150) {
            System.out.println("Please enter your age:");
            age = sc.nextInt();
        }
        System.out.println("Your age:" + age);
    }
}
