
# 🧩 Predicate in Java (Functional Interface)

## 🔹 What is Predicate?

A **Predicate** in Java is a **functional interface** that represents a condition (boolean-valued function) of a single argument. It is part of the **`java.util.function`** package, introduced in **Java 8**.

---

## 📜 Predicate Interface – Definition

```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    // Default methods
    default Predicate<T> and(Predicate<? super T> other)
    default Predicate<T> or(Predicate<? super T> other)
    default Predicate<T> negate()

    // Static method
    static <T> Predicate<T> isEqual(Object targetRef)
}
```

---

## ✅ Key Points

| Feature         | Description |
|----------------|-------------|
| **Package**     | `java.util.function` |
| **Type**        | Functional Interface |
| **Primary Method** | `boolean test(T t)` |
| **Input**       | Takes **one argument** of type `T` |
| **Output**      | Returns a **boolean** result |
| **Use Case**    | Used to evaluate conditions / filters |
| **Supports**    | `and()`, `or()`, `negate()`, `isEqual()` |

---

## 🔧 Common Use Cases

### 1. Filtering Collections

```java
List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom");

Predicate<String> startsWithJ = name -> name.startsWith("J");

names.stream()
     .filter(startsWithJ)
     .forEach(System.out::println);

// Output: John, Jane, Jack
```

### 2. Custom Condition Checking

```java
Predicate<Integer> isEven = number -> number % 2 == 0;

System.out.println(isEven.test(4)); // true
System.out.println(isEven.test(7)); // false
```

---

## 🔄 Combining Predicates

### 🔸 AND (`.and()`)

```java
Predicate<Integer> isPositive = x -> x > 0;
Predicate<Integer> isEven = x -> x % 2 == 0;

Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

System.out.println(isPositiveAndEven.test(4));   // true
System.out.println(isPositiveAndEven.test(-2));  // false
```

---

### 🔸 OR (`.or()`)

```java
Predicate<Integer> isNegative = x -> x < 0;
Predicate<Integer> isZero = x -> x == 0;

Predicate<Integer> isNegativeOrZero = isNegative.or(isZero);

System.out.println(isNegativeOrZero.test(-5)); // true
System.out.println(isNegativeOrZero.test(0));  // true
System.out.println(isNegativeOrZero.test(3));  // false
```

---

### 🔸 NEGATE (`.negate()`)

```java
Predicate<String> isEmpty = String::isEmpty;
Predicate<String> isNotEmpty = isEmpty.negate();

System.out.println(isNotEmpty.test(""));      // false
System.out.println(isNotEmpty.test("Java"));  // true
```

---

## 🧰 Static Method – `Predicate.isEqual()`

```java
Predicate<String> isEqualToJava = Predicate.isEqual("Java");

System.out.println(isEqualToJava.test("Java"));   // true
System.out.println(isEqualToJava.test("Python")); // false
```

---

## 🌍 Real-World Example – Filtering Employees

```java
class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

List<Employee> employees = List.of(
    new Employee("John", 28),
    new Employee("Sara", 35),
    new Employee("Tom", 40)
);

Predicate<Employee> isOlderThan30 = emp -> emp.age > 30;

employees.stream()
         .filter(isOlderThan30)
         .forEach(e -> System.out.println(e.name));

// Output: Sara, Tom
```

---

## 📌 Summary Table

| Concept                  | Description |
|--------------------------|-------------|
| **Functional Interface** | Yes (`@FunctionalInterface`) |
| **Method to implement**  | `boolean test(T t)` |
| **Purpose**              | Evaluates condition on input |
| **Composition Support**  | `.and()`, `.or()`, `.negate()` |
| **Common with**          | Streams, Lambdas, Filtering |

---

## 🧠 Interview Tip

> **Predicate** is often used in stream pipelines for **filtering**, **matching**, and **conditional evaluation**. You should know how to **chain predicates**, use **negate()**, and combine multiple conditions using `.and()` and `.or()`.
