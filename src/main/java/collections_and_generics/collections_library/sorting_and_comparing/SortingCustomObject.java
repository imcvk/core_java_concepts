package collections_and_generics.collections_library.sorting_and_comparing;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;

class Employee {
    String name;
    int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class SortEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class SortingCustomObject {
    public static void main(String[] args) {
        Faker faker = new Faker();
//        ArrayList<Employee> list = new ArrayList<Employee>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new Employee(faker.name().firstName() + " " + faker.name().lastName(),
//                    faker.number().numberBetween(18, 60)));
//        }
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
//        System.out.println("=====================================================================");
//        list.sort(new SortEmployee());
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }

        ArrayList<Employee> list2 = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            list2.add(new Employee(faker.name().firstName() + " " + faker.name().lastName(),
                    faker.number().numberBetween(18, 60)));
        }
        for (Employee employee : list2) {
            System.out.println(employee);
        }
        System.out.println("=====================================================================");
        System.out.println("Using lambda expression");
        list2.sort(((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        }));
        for (Employee employee : list2) {
            System.out.println(employee);
        }
        System.out.println("=====================================================================");
        System.out.println("Using lambda expression");
        list2.sort(((o1, o2) -> {
            return o2.getAge() - o1.getAge();
        }));
        for (Employee employee : list2) {
            System.out.println(employee);
        }
    }
}
