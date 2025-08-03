package org.advanced_java.functional_programming.stream.collectors;

import lombok.Getter;
import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsPractice {
    public static void main(String[] args) {
        // Example 1: Grouping names by their length
        List<String> names = List.of("Ram", "Ashish", "Sachin", "Suresh", "Vijay", "Mahesh", "Rahul", "Amod", "Sumedh");
        List<Integer> numbers = List.of(1, 8, 56, 9, 7, 5, 23, 6, 4, 7, 5, 6, 99, 74, 1, 2, 5, 8, 6);
        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        // Example 2: Count occurrences of each word
        String sentence = "hello world, hello there, how are you, hello java world";
        Map<String, Long> wordCounts = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCounts);

        // Example 3: Group numbers into even and odd
        Map<Boolean, List<Integer>> evenOdd = numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0));
        System.out.println(evenOdd);

        // Example 4: Sum values from a map
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 4);
        fruits.put("Orange", 5);
        fruits.put("Banana", 7);
        fruits.put("Mango", 9);
        System.out.println(fruits.values().stream().reduce(Integer::sum));
        System.out.println(fruits.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Create map of element to its length
        Map<String, Integer> nameLengthMap = names.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(nameLengthMap);

        // Example 6: Count frequency using toMap with merge function
        List<String> words = Arrays.stream(sentence.split(" ")).toList();
        Map<String, Integer> frequencyMap = words.stream().collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
        System.out.println(frequencyMap);

        // Convert names list to different collections
        List<String> listCollected = names.stream().collect(Collectors.toList());
        Set<String> setCollected = names.stream().collect(Collectors.toSet());
        Map<String, Integer> randomMap = names.stream().collect(Collectors.toMap(x -> x, y -> new Random().nextInt(1, 100)));
        System.out.println(listCollected);
        System.out.println(setCollected);
        System.out.println(randomMap);

        // Join names into single comma-separated string
        String joinedNames = names.stream().collect(Collectors.joining(","));
        System.out.println(joinedNames);

        // Count number of elements
        System.out.println(names.stream().collect(Collectors.counting()));

        // Find longest string
        Optional<String> longest = names.stream().collect(Collectors.maxBy(Comparator.comparing(String::length)));
        longest.ifPresent(System.out::println);

        // Sum all integers in the list
        System.out.println(numbers.stream().collect(Collectors.summingInt(Integer::intValue)));

        // Group employees by department
        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 40000),
                new Employee("Bob", "Engineering", 75000),
                new Employee("Charlie", "HR", 42000),
                new Employee("David", "Engineering", 80000),
                new Employee("Eve", "Finance", 60000)
        );
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDept);

        // Count number of employees in each department
        employees = List.of(
                new Employee("Alice", "HR", 40000),
                new Employee("Bob", "Engineering", 75000),
                new Employee("Charlie", "HR", 42000),
                new Employee("David", "Engineering", 80000),
                new Employee("Eve", "Finance", 60000),
                new Employee("Frank", "Engineering", 78000)
        );
        Map<String, Long> empCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(empCount);

        // Average salary per department
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary))));

        // Names grouped by department
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList()))));

        // Partitioning employees by salary > 50k
        System.out.println(employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000)));

        // Grouping by department and salary range
        Map<String, Map<String, List<Employee>>> salaryRangeGrouping = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(e -> e.getSalary() > 50000 ? "greater than 50k" : "less than 50k")));
        System.out.println(salaryRangeGrouping);

        // Salary summarizing
        System.out.println(employees.stream().collect(Collectors.summingInt(Employee::getSalary)));

        // Average salary by department again
        Map<String, Double> avgSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(avgSalaryMap);

        // Frequency map from sentence
        Map<String, Long> sentenceWordFreq = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(sentenceWordFreq);

        // Join employee names by department
        Map<String, String> joinedNamesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.joining(","))));
        System.out.println(joinedNamesByDept);

        CollectionUtility.outputDivider();

        // Reduce to highest transaction per category
        List<Transaction> transactions = List.of(
                new Transaction("T001", "Food", 150.0),
                new Transaction("T002", "Electronics", 1200.0),
                new Transaction("T003", "Food", 200.0),
                new Transaction("T004", "Clothing", 500.0),
                new Transaction("T005", "Electronics", 2200.0),
                new Transaction("T006", "Clothing", 350.0)
        );
        Map<String, Optional<Transaction>> highestByCategory = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory,
                        Collectors.maxBy(Comparator.comparing(Transaction::getAmount))));
        highestByCategory.forEach((category, transaction) ->
                System.out.println(category + " → " + transaction.orElse(null)));

        // Using collectingAndThen to get unmodifiable list
        List<String> unmodifiableNames = names.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println("Unmodifiable List: " + unmodifiableNames);
        try {
            unmodifiableNames.add("Eve");
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification not allowed: " + e.getMessage());
        }
    }
}

@Getter
class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

@Getter
class Transaction {
    private String id;
    private String category;
    private double amount;

    public Transaction(String id, String category, double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + "}";
    }
}
