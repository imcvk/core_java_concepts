package interview_questions;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        String s = str.contains(" ") ? str.replace(" ", "") : str.replace("", "");
        System.out.println(isPalindrome(s.toLowerCase()));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            String c1 = s.charAt(start) + "";
            String c2 = s.charAt(end) + "";
            System.out.println("Start: " + s.charAt(start) + " End: " + s.charAt(end));
            if (!c1.equalsIgnoreCase(c2)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
