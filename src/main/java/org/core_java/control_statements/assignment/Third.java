package org.core_java.control_statements.assignment;

import java.util.Scanner;

//Create a program to calculate the absolute value of a given integer.
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a >= 0 ? a : -a;
        System.out.println(num);
    }
}
