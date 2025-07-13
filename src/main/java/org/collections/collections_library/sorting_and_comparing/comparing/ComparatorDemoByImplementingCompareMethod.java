package org.collections.collections_library.sorting_and_comparing.comparing;

import org.collections.collections_library.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortingByName implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        // sorting based on name
        return o1.getName().compareTo(o2.getName());
    }
}

class SortingByRollNo implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
//This will sort based on roll number
        return o1.getRollNo() - o2.getRollNo();
    }
}

class SortingByMarks implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        // this will sort based on marks
        return o1.getMarks() - o2.getMarks();
    }
}

public class ComparatorDemoByImplementingCompareMethod {
    public static void main(String[] args) {
        List<Student> students = CollectionUtility.getStudentList(ArrayList::new);
        students.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Sorting based on name");
        students.sort(new SortingByName());
        students.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Sorting based on Marks");
        students.sort(new SortingByMarks());
        students.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Sorting based on roll no");
        students.sort(new SortingByRollNo());
        students.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------");

    }
}
