package org.advanced_java.exception_handling.customException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age <= 0 || age > 100) {
                throw new InvalidAgeException("Not valid age");
            } else {
                System.out.println("Valid age");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
