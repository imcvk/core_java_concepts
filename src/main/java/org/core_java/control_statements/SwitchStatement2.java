package org.core_java.control_statements;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String day = "3"; // Example day of the week as a String (1-7)
        String dayString;
        switch (day) {
            case "1":
                dayString = "Monday";
                break;
            case "2":
                dayString = "Tuesday";
                break;
            case "3":
                dayString = "Wednesday";
                break;
            case "4":
                dayString = "Thursday";
                break;
            case "5":
                dayString = "Friday";
                break;
            case "6":
                dayString = "Saturday";
                break;
            case "7":
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println("The day is: " + dayString);
    }
}
