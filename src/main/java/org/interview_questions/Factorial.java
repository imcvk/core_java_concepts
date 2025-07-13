package org.interview_questions;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(factorial(num));
    }

    public static double factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
