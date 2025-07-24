package org.advanced_java.functional_programming.predicate_demo;

import lombok.*;

import java.util.List;
import java.util.function.Predicate;

public class FilterEmployees {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 28),
                new Employee("Sara", 35),
                new Employee("Tom", 55),
                new Employee("Tom", 68),
                new Employee("Tom", 78),
                new Employee("Tom", 90)
        );
        Predicate<Employee> olderThan50= e->e.age>50;
        employees.stream().filter(olderThan50).forEach(System.out::println);
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Employee {
    String name;
    int age;
}


