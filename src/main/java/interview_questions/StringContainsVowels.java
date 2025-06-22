package interview_questions;

public class StringContainsVowels {
    public static void main(String[] args) {
        String temp="ths s  vwl";
        String reg=".*[aeiouAEIOU]*.";
        System.out.println(temp.matches(reg));
    }
}
