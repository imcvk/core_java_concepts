package collections_and_generics.collections_library.collection_utility;

import net.datafaker.Faker;

import java.util.Collection;
import java.util.function.Supplier;

import collections_and_generics.collections_library.sorting_and_comparing.comparing.Student;

public class CollectionUtility {
    static Faker faker = new Faker();

    // Generic method to create a list of names in any collection type
    public static <T extends Collection<String>> T getNameList(Supplier<T> collectionSupplier) {
        T names = collectionSupplier.get();
        for (int i = 0; i < 10; i++) {
            names.add(faker.name().firstName());
        }
        return names;
    }

    // Generic method to create a list of cities in any collection type
    public static <T extends Collection<String>> T getCityList(Supplier<T> collectionSupplier) {
        T cityList = collectionSupplier.get();
        for (int i = 0; i < 10; i++) {
            cityList.add(faker.address().city());
        }
        return cityList;
    }

    // Generic method to create a list of ages in any collection type
    public static <T extends Collection<Integer>> T getAgeList(Supplier<T> collectionSupplier) {
        T ageList = collectionSupplier.get();
        for (int i = 0; i < 10; i++) {
            ageList.add(faker.number().numberBetween(1, 100));
        }
        return ageList;
    }

    // Generic method to print values from any collection
    public static <T> void printValues(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    // Generic method to create a list of students in any collection type
    public static <T extends Collection<Student>> T getStudentList(Supplier<T> collectionSupplier) {
        T studentLisT = collectionSupplier.get();
        for (int i = 0; i < 10; i++) {
            Student s = new Student(faker.number().numberBetween(1, 100),
                    faker.name().fullName(),
                    faker.number().numberBetween(1, 100));
            studentLisT.add(s);
        }
        return studentLisT;
    }
    public static void outputDivider(){
        System.out.println("---------------------------------------------------------------------");
    }
}
