package org.exception_handling;

public class TryCatch_demo {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
