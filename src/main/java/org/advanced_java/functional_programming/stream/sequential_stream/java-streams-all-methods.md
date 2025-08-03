
# Java Streams - Comprehensive Guide with All Methods

## 🔍 What Are Java Streams?

Java Streams allow you to process data collections using **functional programming techniques**. Streams are not data structures but rather **views** of data, enabling:
- Filtering
- Mapping
- Reducing
- Collecting
- Searching
- Sorting

---

## 🧪 STREAM METHODS AND FUNCTIONALITY

Each method below is explained with:

- What it does
- When to use it
- Example

---

### 🎯 `filter(Predicate<T>)`
Filters elements by a boolean condition.

```java
List<Integer> nums = List.of(1, 2, 3, 4, 5);
nums.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);  // 2 4
```

---

### 🔄 `map(Function<T, R>)`
Transforms each element into something else.

```java
List<String> names = List.of("java", "python");
names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

---

### 🧨 `flatMap(Function<T, Stream<R>>)`
Flattens multiple streams into one.

```java
List<List<String>> nested = List.of(List.of("A"), List.of("B", "C"));
nested.stream()
      .flatMap(List::stream)
      .forEach(System.out::println);  // A B C
```

---

### 📏 `distinct()`
Removes duplicate elements.

```java
Stream.of(1, 2, 2, 3).distinct().forEach(System.out::println);  // 1 2 3
```

---

### ⬆️ `sorted()` / `sorted(Comparator<T>)`
Sorts elements.

```java
list.stream().sorted().forEach(System.out::println);

list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
```

---

### 🔍 `peek(Consumer<T>)`
Performs action on each element without changing it.

```java
list.stream().peek(System.out::println).count();
```

---

### 🎚️ `limit(long maxSize)`
Truncates stream to max `n` elements.

```java
list.stream().limit(5).forEach(System.out::println);
```

---

### 🪜 `skip(long n)`
Skips first `n` elements.

```java
list.stream().skip(3).forEach(System.out::println);
```

---

### 🧾 `collect(Collector)`
Collects result into list, set, map, or summary.

```java
List<String> upper = names.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());
```

---

### ➕ `reduce(BinaryOperator)`
Combines elements into one.

```java
int sum = Stream.of(1, 2, 3).reduce(0, Integer::sum);
```

---

### 🧮 `count()`
Counts elements.

```java
long count = list.stream().filter(n -> n > 5).count();
```

---

### 🔎 `anyMatch`, `allMatch`, `noneMatch`
Checks condition on stream.

```java
boolean result = list.stream().anyMatch(n -> n == 3);
```

---

### 🎯 `findFirst()` / `findAny()`
Returns the first/any element wrapped in `Optional`.

```java
Optional<String> first = list.stream().findFirst();
```

---

### 💥 `toArray()`
Converts stream to array.

```java
String[] array = list.stream().toArray(String[]::new);
```

---

### 🚦 `builder()`
Programmatically build streams.

```java
Stream<String> stream = Stream.<String>builder()
                              .add("A")
                              .add("B")
                              .build();
```

---

### 🔁 `iterate(seed, UnaryOperator)`
Generates infinite stream, used with `limit()`.

```java
Stream.iterate(1, n -> n + 1).limit(5).forEach(System.out::println);
```

---

### 🧪 `generate(Supplier<T>)`
Generates infinite elements from a Supplier.

```java
Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);
```

---

### 🌐 `parallel()` / `parallelStream()`
Processes elements in parallel.

```java
list.parallelStream().forEach(System.out::println);
```

---

### 🛑 `close()` and `onClose()`
Releases resources (used in custom stream pipelines).

```java
Stream<String> s = Stream.of("A").onClose(() -> System.out.println("Closed"));
s.close();
```

---

## 🧠 Summary

Java Streams provide a clean and powerful API to manipulate and query data declaratively. Knowing **when and how to use each method** leads to better performance, readability, and maintainability.

---

## 📘 Further Reading

- [Java 8 Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [Collectors API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)
