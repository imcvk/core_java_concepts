package org.core_java.control_statements.assignment.other_assignments;

public class FactorialUsingRecursiveMethod {
    public static void main(String[] args) {
        long num = 20;
        System.out.println(factorial(num));
    }

    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
