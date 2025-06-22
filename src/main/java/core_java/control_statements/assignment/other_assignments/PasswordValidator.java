package core_java.control_statements.assignment.other_assignments;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do {
            System.out.println("Enter your password: ");
            pass = sc.nextLine();
        } while (!isPasswordValid(pass));

    }

    public static boolean isPasswordValid(String pass) {
        boolean valid = false;
        if (pass.length() > 6) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }
}
