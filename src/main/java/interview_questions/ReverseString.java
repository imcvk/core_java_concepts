package interview_questions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "this is a string";
        System.out.println(reverseString3(s));
    }

    public static String reverseString(String s) {
        String out = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            out = out + s.charAt(i);
        }
        return out;
    }

    public static String reverseString2(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
    public static String reverseString3(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
