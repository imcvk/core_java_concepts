package org.advanced_java.collections.learning.sorting_and_comparing.revision;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;
import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Comparable<Employee> {
    String name;
    int age;
    int salary;

    @Override
    public int compareTo(Employee o) {
        return age - o.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee("Steve", 28, 456454);
        Employee employee2 = new Employee("Bill", 24, 456454);
        Employee employee3 = new Employee("Elon", 31, 456454);
        Employee employee4 = new Employee("Dan", 36, 456454);
        Employee employee5 = new Employee("Anil", 47, 456454);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        CollectionUtility.outputDivider();
        employees.forEach(System.out::println);
        CollectionUtility.outputDivider();
//        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//        Collections.sort(employees, employeeComparator);
        employees.sort(Comparator.comparing(Employee::getName));
        employees.forEach(System.out::println);
        CollectionUtility.outputDivider();
    }
}
