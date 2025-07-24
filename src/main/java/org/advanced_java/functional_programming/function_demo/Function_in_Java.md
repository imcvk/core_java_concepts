
# 🔧 `Function<T, R>` in Java – Complete Guide

## 📘 What is `Function`?

The `Function<T, R>` interface is a **functional interface** in Java that represents a **function which takes one argument of type T and produces a result of type R**. It is part of the `java.util.function` package introduced in **Java 8** for functional-style programming.

---

## 📜 Functional Interface Definition

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);

    // Default methods
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before);
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after);

    // Static method
    static <T> Function<T, T> identity()
}
```

---

## ✅ Key Points

| Feature        | Details                                  |
|----------------|------------------------------------------|
| Package        | `java.util.function`                     |
| Type           | Functional Interface                     |
| Abstract Method| `R apply(T t)`                           |
| Input          | 1 argument of type `T`                   |
| Output         | Returns value of type `R`                |
| Use Cases      | Transformations, mappings, conversions   |
| Commonly Used With | Streams, Optional, lambda expressions |

---

## 🔧 Basic Usage

### Convert String to Length

```java
Function<String, Integer> stringLength = str -> str.length();
System.out.println(stringLength.apply("Java")); // Output: 4
```

### Square of a number

```java
Function<Integer, Integer> square = x -> x * x;
System.out.println(square.apply(5)); // Output: 25
```

---

## 🔄 Function Composition

### Using `andThen()`

```java
Function<Integer, Integer> multiplyBy2 = x -> x * 2;
Function<Integer, Integer> add3 = x -> x + 3;

Function<Integer, Integer> multiplyThenAdd = multiplyBy2.andThen(add3);
System.out.println(multiplyThenAdd.apply(5)); // (5 * 2) + 3 = 13
```

### Using `compose()`

```java
Function<Integer, Integer> multiplyBy2 = x -> x * 2;
Function<Integer, Integer> add3 = x -> x + 3;

Function<Integer, Integer> addThenMultiply = multiplyBy2.compose(add3);
System.out.println(addThenMultiply.apply(5)); // (5 + 3) * 2 = 16
```

---

## 🧾 Identity Function

```java
Function<String, String> identityFunc = Function.identity();
System.out.println(identityFunc.apply("Hello")); // Output: Hello
```

---

## 📦 Real-Time Use Cases

### 1. Mapping Employee Names

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
    new Employee("Alice", 30),
    new Employee("Bob", 25)
);

Function<Employee, String> getName = emp -> emp.name;

employees.stream()
         .map(getName)
         .forEach(System.out::println);
// Output: Alice, Bob
```

---

### 2. Convert Celsius to Fahrenheit

```java
Function<Double, Double> celsiusToFahrenheit = c -> (c * 9/5) + 32;
System.out.println(celsiusToFahrenheit.apply(0.0));  // 32.0
System.out.println(celsiusToFahrenheit.apply(100.0)); // 212.0
```

---

### 3. Format Price with Currency Symbol

```java
Function<Double, String> formatPrice = price -> "$" + String.format("%.2f", price);
System.out.println(formatPrice.apply(15.5)); // $15.50
```

---

## 🧪 Practice Problems

### 🔰 1. Convert String to Upper Case

```java
Function<String, String> toUpper = s -> s.toUpperCase();
```

---

### 🔰 2. Extract domain from email

```java
Function<String, String> extractDomain = email -> email.substring(email.indexOf("@") + 1);
System.out.println(extractDomain.apply("user@example.com")); // example.com
```

---

### 🔰 3. Parse and Multiply

```java
Function<String, Integer> parseAndDouble = s -> Integer.parseInt(s) * 2;
System.out.println(parseAndDouble.apply("10")); // 20
```

---

### 🔰 4. Chain Functions

Convert string to int, multiply by 10, convert back to string:

```java
Function<String, Integer> toInt = Integer::parseInt;
Function<Integer, Integer> times10 = x -> x * 10;
Function<Integer, String> toString = String::valueOf;

Function<String, String> chain = toInt.andThen(times10).andThen(toString);
System.out.println(chain.apply("7")); // "70"
```

---

## 🧠 Interview Tip

- Prefer `Function<T,R>` when you need **transformation logic**.
- Use `Predicate<T>` when evaluating a **condition** (true/false).
- Combine `Function`, `Predicate`, and `Consumer` for powerful stream pipelines.

---
