package collections_and_generics.collections_library.sorting_and_comparing.comparing;

import java.util.ArrayList;
import java.util.List;

import collections_and_generics.collections_library.CollectionUtility;
class ComparableImplementer implements Comparable<Student>{


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {

        List<Student> students = CollectionUtility.getStudentList(ArrayList::new);
        students.forEach(System.out::println);
    }
}
