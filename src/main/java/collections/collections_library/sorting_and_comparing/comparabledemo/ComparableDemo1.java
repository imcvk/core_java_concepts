package collections.collections_library.sorting_and_comparing.comparabledemo;

import collections.collections_library.collection_utility.CollectionUtility;
import lombok.Getter;
import lombok.Setter;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo1 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Steve", 22);
        students.add(student1);
        Student student2 = new Student("John", 25);
        students.add(student2);
        Student student3 = new Student("Johnny", 23);
        students.add(student3);
        Student student4 = new Student("Jason", 21);
        students.add(student4);
        students.forEach(System.out::println);
        CollectionUtility.outputDivider();
        students.sort(null);
        students.forEach(System.out::println);
        CollectionUtility.outputDivider();
    }
}

@Setter
@Getter
class Student implements Comparable<Student> {
    String name;
    int age;

    public Student() {
    }

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

    @Override
    public int compareTo(Student o) {
        return  this.getAge()-o.getAge();
    }
}