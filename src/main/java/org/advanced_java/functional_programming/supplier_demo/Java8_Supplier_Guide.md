# Supplier in Java 8

## 📌 Overview

In Java 8, `Supplier<T>` is a **functional interface** that represents a supplier of results. It takes **no input** but returns a **value of type T**. It's defined in the `java.util.function` package.

```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```

It is typically used in **lazy evaluation**, **factory methods**, **dependency injection**, and **generating values on demand**.

---

## 🔧 Use Cases in Enterprise Applications

- **Lazy initialization** of expensive resources.
- **Factory pattern** for object creation.
- **Supplying default values** when needed.
- **Stream generation** (`Stream.generate`).
- **Integration with frameworks** like Spring for bean configuration.

---

## ✅ Example 1: Simple Supplier

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Welcome to Java Supplier!";
        System.out.println(supplier.get()); // Output: Welcome to Java Supplier!
    }
}
```

---

## ✅ Example 2: Lazy Initialization

```java
public class ExpensiveObject {
    public ExpensiveObject() {
        System.out.println("ExpensiveObject created!");
    }
}

public class LazyLoader {
    private Supplier<ExpensiveObject> supplier = this::createObject;
    private ExpensiveObject instance;

    private ExpensiveObject createObject() {
        if (instance == null) {
            instance = new ExpensiveObject();
        }
        return instance;
    }

    public ExpensiveObject getInstance() {
        return supplier.get();
    }
}
```

---

## ✅ Example 3: With Stream.generate()

```java
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        Stream.generate(randomSupplier)
              .limit(5)
              .forEach(System.out::println);
    }
}
```

---

## ⚙️ Real-time Use Case in Enterprise Development

### Example: Default configuration loader

```java
public class ConfigLoader {
    private Supplier<String> defaultConfigSupplier = () -> "default-config.yml";

    public String loadConfig(String configPath) {
        return configPath != null ? configPath : defaultConfigSupplier.get();
    }
}
```

---

## 💡 Key Points

| Feature               | Details |
|-----------------------|---------|
| Input                 | None |
| Output                | A value of type `T` |
| Functional Method     | `T get()` |
| Type of Interface     | Functional Interface |
| Common Use            | Lazy loading, default values, stream generation |

---

## 🤔 When to Use `Supplier<T>`

- When you want **deferred computation**.
- When object creation is **expensive** and should be **done only if needed**.
- When a **method doesn’t require input but produces a result**.

---

## 🧠 Interview Tip

- `Supplier<T>` is **opposite of `Consumer<T>`** — it **produces** a value, while `Consumer<T>` **consumes** a value.
- Often used in **builder patterns**, **configuration loading**, and **memoization**.

---

## 🧪 Practice Questions

1. Write a `Supplier<Integer>` that supplies the next value of a counter.
2. Use `Supplier<List<String>>` to initialize a new list only when needed.
3. Create a factory class using `Supplier<Product>`.
4. Implement a cache where values are loaded via a `Supplier<T>`.

---

## 🧾 Summary

- `Supplier<T>` helps **generate values without input**.
- Promotes **clean**, **modular**, and **testable** code.
- Vital in **Java 8 functional programming** and enterprise applications.