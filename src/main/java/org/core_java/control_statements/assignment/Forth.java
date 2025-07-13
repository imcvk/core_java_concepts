package org.core_java.control_statements.assignment;

//Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator (e.g.,
//High for scores > 80, Moderate for 50-80, Low for < 50).

public class Forth {
    public static void main(String[] args) {
        int score = 70;
        String grade = score > 80 ? "High" : (score >= 50 ? "Modrate" : "Low");
        System.out.println(grade);
    }
}
