package core_java.user_input;

import java.io.BufferedReader;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("i:" + i);

    }
}
