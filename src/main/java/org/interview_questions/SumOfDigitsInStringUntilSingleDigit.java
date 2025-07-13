package org.interview_questions;

public class SumOfDigitsInStringUntilSingleDigit {
    public static void main(String[] args) {
        String s = "12345678912";
        while (true) {
            s = sumOfDigits(s);
            System.out.println(s);
            if (s.length() == 1) {
                break;
            }
        }
        System.out.println(s);
    }

    public static String sumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum + "";
    }
}
