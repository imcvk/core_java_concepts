package core_java.constructorDemo;

public class Course {
    String courseName;
    int enrolledStudents;
    public static int maxCapacity;

    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println("Max capacity set to: " + maxCapacity);
    }

    public void enrolledStudents(String studentName) {
        System.out.println("Enrolling student: " + studentName + " in course: " + courseName);
    }

    public void dropStudent(String studentName) {
        System.out.println("Dropping student: " + studentName + " from course: " + courseName);
    }

    Course(String coursename, int enrolledStudents) {
        this.courseName = coursename;
        this.enrolledStudents = enrolledStudents;
        System.out.println("Course created: " + courseName + " with " + enrolledStudents + " students enrolled.");
    }

    public static void main(String[] args) {
        Course c = new Course("Mathematics", 30);
        Course.setMaxCapacity(50);
        c.enrolledStudents("John Doe");
        c.dropStudent("Jane Doe");
    }
}
