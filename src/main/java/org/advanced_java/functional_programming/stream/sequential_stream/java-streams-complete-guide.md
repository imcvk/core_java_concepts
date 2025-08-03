
# Java Streams - Complete Guide

## 🔍 What are Streams in Java?

**Streams** in Java (introduced in Java 8) are a powerful abstraction to process sequences of elements (usually collections) in a **functional style**. Streams support **declarative programming**, making code **cleaner**, **more readable**, and **parallelizable**.

A Stream does **not store data**, it operates on a source (like a Collection or array) and produces a result, possibly transforming the elements during the process.

---

## 🧱 Characteristics of Streams

- **No storage**: Does not modify the underlying data structure.
- **Functional**: Emphasizes what to do, not how to do it.
- **Lazy**: Computation happens only when a terminal operation is invoked.
- **Possibly parallel**: Can run operations in parallel (`parallelStream()`).
- **Consumable**: Streams can only be used once.

---

## 📊 Types of Stream Operations

### 1. **Intermediate Operations**
These return another Stream and are **lazy**.
- `map()`
- `filter()`
- `distinct()`
- `sorted()`
- `peek()`
- `limit()`
- `skip()`

### 2. **Terminal Operations**
These produce a result or a side-effect.
- `collect()`
- `forEach()`
- `toArray()`
- `reduce()`
- `count()`
- `anyMatch()`, `allMatch()`, `noneMatch()`
- `findFirst()`, `findAny()`

---

## ⚙️ Stream Pipeline

A typical Stream pipeline consists of:
```java
source.stream() → intermediate operations → terminal operation
```

Example:
```java
List<String> names = List.of("Anu", "Chaitanya", "Ravi");
names.stream()
     .filter(n -> n.startsWith("C"))
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

---

## 🔧 Stream Methods with Examples

### 1. `filter(Predicate<T>)`
Filters elements based on a condition.
```java
List<Integer> nums = List.of(1, 2, 3, 4, 5);
nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println); // 2 4
```

### 2. `map(Function<T, R>)`
Transforms elements.
```java
List<String> names = List.of("java", "python");
names.stream().map(String::toUpperCase).forEach(System.out::println);
```

### 3. `flatMap(Function<T, Stream<R>>)`
Flattens nested structures.
```java
List<List<String>> list = List.of(List.of("A", "B"), List.of("C", "D"));
list.stream().flatMap(List::stream).forEach(System.out::println);
```

### 4. `distinct()`
Removes duplicates.
```java
List<Integer> list = List.of(1, 2, 2, 3);
list.stream().distinct().forEach(System.out::println); // 1 2 3
```

### 5. `sorted()`
Sorts elements in natural order.
```java
List<String> items = List.of("Banana", "Apple", "Cherry");
items.stream().sorted().forEach(System.out::println);
```

### 6. `peek(Consumer<T>)`
Performs an action without changing the stream.
```java
List<String> names = List.of("John", "Doe");
names.stream().peek(System.out::println).count(); // prints each element
```

### 7. `limit(n)`
Restricts the number of elements.
```java
Stream.of(1, 2, 3, 4, 5).limit(3).forEach(System.out::println);
```

### 8. `skip(n)`
Skips the first `n` elements.
```java
Stream.of(1, 2, 3, 4, 5).skip(2).forEach(System.out::println); // 3 4 5
```

---

## 🚀 Terminal Operations

### 1. `forEach(Consumer<T>)`
Iterates and performs action.
```java
list.stream().forEach(System.out::println);
```

### 2. `collect(Collector)`
Collects elements into a Collection.
```java
List<String> result = list.stream().collect(Collectors.toList());
```

### 3. `reduce(BinaryOperator)`
Combines elements into one.
```java
int sum = List.of(1, 2, 3).stream().reduce(0, Integer::sum);
```

### 4. `count()`
Counts elements.
```java
long count = list.stream().filter(e -> e.length() > 3).count();
```

### 5. `anyMatch`, `allMatch`, `noneMatch`
Checks match conditions.
```java
boolean hasEven = list.stream().anyMatch(n -> n % 2 == 0);
```

### 6. `findFirst()`, `findAny()`
Returns first or any element.
```java
Optional<String> first = list.stream().findFirst();
```

---

## 🏢 Enterprise Use Case: Filtering Active Users

```java
List<User> activeUsers = users.stream()
    .filter(User::isActive)
    .sorted(Comparator.comparing(User::getLastLogin).reversed())
    .limit(100)
    .collect(Collectors.toList());
```

---

## 🧵 Parallel Streams

```java
list.parallelStream().forEach(System.out::println);
```

Use with caution for large, stateless, and associative operations.

---

## ❌ When Not to Use Streams

- When **performance-critical loops** need primitive operations.
- When code clarity is more important than conciseness.
- When exception handling inside a stream gets messy.

---

## 🧠 Summary

- Streams enable declarative, functional-style processing.
- Prefer streams when working with collections and transformations.
- Use `map`, `filter`, `reduce`, `collect` as building blocks.
- Use parallel streams carefully and measure performance.

---

## 🧪 Practice Tasks

1. Flatten a list of lists using `flatMap`.
2. Count employees older than 30.
3. Group books by genre.
4. Find the max salary in a list of Employee objects.
5. Convert a list of names into a map with name length as value.

---

## 📎 References

- [Oracle Stream API Docs](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [Baeldung Stream Guide](https://www.baeldung.com/java-8-streams)
