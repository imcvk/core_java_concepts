package collections.collections_library.sorting_and_comparing.revision;

import collections.collections_library.collection_utility.CollectionUtility;
import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    @Override
    public int compareTo(Student o) {
        return this.getMarks() - o.getMarks();
    }
}

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student(1, "Steve", 152);
        Student student2 = new Student(2, "Donald", 123);
        Student student3 = new Student(3, "Richard", 145);
        Student student4 = new Student(4, "Eric", 126);
        Student student5 = new Student(5, "Gavin", 175);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.forEach(System.out::println);
        CollectionUtility.outputDivider();
        System.out.println("Normal sort: ");
//        students.sort(null); //this doesnt work on custom object
        Collections.sort(students);
        CollectionUtility.outputDivider();
        students.forEach(System.out::println);
        CollectionUtility.outputDivider();
        students.sort(null);
        students.forEach(System.out::println);
    }
}
