package core_java.control_statements.assignment.other_assignments;

public class FactorialDemo {
    public static void main(String[] args) {
        long i = 20;
        System.out.println(getFactorial(i));
    }

    public static long getFactorial(long a) {
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *=i;
        }
        return f;
    }
//    public static void main(String[] args) {
//    int number = 20; // Change this value as needed
//    System.out.println(factorial(number));
//}
//public static long factorial(int n) {
//    long result = 1;
//    for (int i = 1; i <= n; i++) {
//        result *= i;
//    }
//    return result;
//}
}
