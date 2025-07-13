package org.interview_questions;

public class IsPrime {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return false;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
