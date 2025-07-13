package org.core_java.problems;

import java.util.HashMap;

public class FindNumberOfRepeatingCharsInString {
    public static void main(String[] args) {
        String str = "Supriya";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String str1 = String.valueOf(str.charAt(i));
            int c = 0;
            for (int j = 0; j < str.length(); j++) {
                String str2 = String.valueOf(str.charAt(j));
                if (str1.equalsIgnoreCase(str2)) {
                    c++;
                }
            }
            map.put(str1, c);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
