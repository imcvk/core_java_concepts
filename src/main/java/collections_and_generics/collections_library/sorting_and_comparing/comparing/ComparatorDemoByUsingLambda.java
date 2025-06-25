package collections_and_generics.collections_library.sorting_and_comparing.comparing;

import collections_and_generics.collections_library.collection_utility.CollectionUtility;

import java.util.ArrayList;

public class ComparatorDemoByUsingLambda {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students = CollectionUtility.getStudentList(ArrayList::new);
        System.out.println("Before sorting:");
        students.forEach(System.out::println);
        System.out.println("--------------------------------------");
        students.sort((s1, s2) -> s1.getMarks() - s2.getMarks());
        students.forEach(System.out::println);
    }
}
