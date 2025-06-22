package interview_questions;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.print(getFibonacci(i)+" ");
        }
    }

    public static int getFibonacci(int n) {
        if (n <= 1)
            return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
