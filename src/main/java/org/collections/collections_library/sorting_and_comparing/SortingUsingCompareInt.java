package org.collections.collections_library.sorting_and_comparing;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;
    int age;

    public Student() {
    }

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SortingUsingCompareInt {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(faker.number().numberBetween(1, 100),
                    faker.name().fullName(),
                    faker.number().numberBetween(8, 14)));
        }
        students.forEach(System.out::println);
        System.out.println("=============================================================");
        Collections.sort(students, Comparator.comparing(Student::getRollNo).thenComparing(Student::getAge));
        System.out.println("After sorting by age and roll no");
        students.forEach(System.out::println);
    }
}
