package core_java.control_statements.assignment.other_assignments;

public class EvenNumberPrinter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -10, 5, -4, 6, 7, 8, 9, -100};
        for (int num : arr) {
            if (num % 2 == 1) {
                continue;
            } else {
                System.out.println("even number: " + num);
            }
        }
    }
}
