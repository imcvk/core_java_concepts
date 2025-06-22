package core_java.control_statements.assignment.other_assignments;

public class RecursivePalindromeChecker {
    public static void main(String[] args) {
        String str = "NITIN";
        System.out.println("Your String is " + (checkPalindrome(str) ? "Palindrome" : "Not palindrome"));
    }

    public static boolean checkPalindrome(String s) {
        int lastIndex = s.length() - 1;
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        String rest = s.substring(1, lastIndex);
        return checkPalindrome(rest);
    }
}
