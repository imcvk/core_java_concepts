
# Java Method References - Detailed Guide

## 🧠 What are Method References in Java?

Method references in Java are a shorthand notation of **lambda expressions** to call a method directly. Introduced in **Java 8**, method references improve readability by eliminating boilerplate lambda code when a method already exists that can perform the action.

---

## ✅ Syntax of Method Reference

```
ClassName::methodName
```

Or for instance methods:
```
object::instanceMethodName
```

---

## 🔄 Types of Method References

### 1. **Reference to a Static Method**
**Syntax**: `ClassName::staticMethodName`

#### ✅ Example:
```java
Function<String, Integer> strLength = String::length;
```

```java
class Utils {
    public static int square(int n) {
        return n * n;
    }
}

Function<Integer, Integer> squareFunc = Utils::square;
```

---

### 2. **Reference to an Instance Method of a Particular Object**
**Syntax**: `instance::methodName`

#### ✅ Example:
```java
class MyPrinter {
    public void print(String message) {
        System.out.println(message);
    }
}

MyPrinter printer = new MyPrinter();
Consumer<String> print = printer::print;
```

---

### 3. **Reference to an Instance Method of an Arbitrary Object of a Particular Type**
**Syntax**: `ClassName::instanceMethodName`

Used when lambda refers to an instance method of the argument.

#### ✅ Example:
```java
List<String> names = Arrays.asList("Anu", "Chaitanya", "Ravi");
names.forEach(System.out::println);
```

```java
Function<String, String> toUpper = String::toUpperCase;
```

---

### 4. **Reference to a Constructor**
**Syntax**: `ClassName::new`

Useful when creating new instances using functional interfaces like `Supplier`, `Function`.

#### ✅ Example:
```java
Supplier<List<String>> listSupplier = ArrayList::new;

Function<String, StringBuilder> sbBuilder = StringBuilder::new;
```

---

## 🧪 Method Reference vs Lambda - Comparison

| Lambda Expression                         | Method Reference                 |
|-------------------------------------------|----------------------------------|
| `(x) -> Integer.parseInt(x)`              | `Integer::parseInt`              |
| `(s) -> System.out.println(s)`            | `System.out::println`            |
| `() -> new ArrayList<>()`                 | `ArrayList::new`                 |
| `(str) -> str.toLowerCase()`              | `String::toLowerCase`            |

---

## 🧩 Real-Time Use Case

### Sorting a list of strings:
```java
List<String> cities = Arrays.asList("Pune", "Mumbai", "Delhi");
cities.sort(String::compareToIgnoreCase);
```

### Thread creation using constructor reference:
```java
Runnable r = MyRunnable::new;
new Thread(r).start();
```

---

## ⚠️ When to Use Method References?

Use method references when:
- The lambda expression **only calls an existing method**.
- You want to **simplify code readability**.
- The **method signature matches the functional interface method**.

---

## ❌ Limitations
- Can be used **only if** method signature aligns with the abstract method of the functional interface.
- **Less flexible** than lambdas if you need to pass extra logic.

---

## 📌 Practice Problems

1. Convert lambda expressions into method references.
2. Use constructor reference to initialize a list of users.
3. Write a stream that uses method reference to filter strings starting with "A".
4. Replace lambdas with method references in sorting a map by keys.

---

## 📎 References

- [Oracle Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)
- [Baeldung - Method References](https://www.baeldung.com/java-method-references)
