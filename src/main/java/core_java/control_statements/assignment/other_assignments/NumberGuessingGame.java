package core_java.control_statements.assignment.other_assignments;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        Random rand = new Random();
        int actualNum = rand.nextInt(100);
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        } while (num != actualNum);
            System.out.println("you got it");

    }
}
