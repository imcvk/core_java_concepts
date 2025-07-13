package org.core_java.stringdemo.assignment;

public class StringConcat_Uppercase {
    public static void main(String[] args) {
        String s1 = "This is code to concat";
        String s2 = "This is code to concat";
        String s3 = s2.concat(s2).toUpperCase();
        System.out.println(s3);
    }
}
