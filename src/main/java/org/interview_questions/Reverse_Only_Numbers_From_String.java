package org.interview_questions;

import java.util.function.Function;

public class Reverse_Only_Numbers_From_String {
    public static void main(String[] args) {
        String input = "Java is 2016 a programming language 2033";
        String output = "";
        String[] splitString = input.split(" ");
        Function<String, String> reverserIt = x -> new StringBuilder(x).reverse().toString();
        Function<String, Boolean> isNumber = (x) -> {
            boolean f = false;
            try {
                Integer.parseInt(x);
                f = true;
            } catch (Exception e) {
                f = false;
            }
            return f;
        };
        for (String s : splitString) {
            if (isNumber.apply(s)) {
                output = output + " " + reverserIt.apply(s);
            } else {
                output = output + " " + s;
            }
        }
        System.out.println(output.trim());
    }

}
