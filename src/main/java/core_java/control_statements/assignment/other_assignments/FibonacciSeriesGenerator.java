package core_java.control_statements.assignment.other_assignments;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i < num; i++) {
            System.out.print(fibonacciSeries(i) + ", ");
        }
    }

    public static int fibonacciSeries(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
