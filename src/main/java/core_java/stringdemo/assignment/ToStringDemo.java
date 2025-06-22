package core_java.stringdemo.assignment;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        System.out.println(s1);
    }
}
