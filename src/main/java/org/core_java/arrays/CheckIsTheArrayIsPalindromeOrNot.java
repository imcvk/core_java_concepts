package org.core_java.arrays;

public class CheckIsTheArrayIsPalindromeOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        System.out.println(isPalindrome(arr));
    }

    public static boolean isPalindrome(int[] arr) {
        boolean palindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
