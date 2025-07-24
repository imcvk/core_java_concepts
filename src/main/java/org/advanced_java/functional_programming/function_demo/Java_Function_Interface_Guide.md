
# 📘 Java `Function<T, R>` — Complete Guide with Theory & Composition

---

## 🔷 What is a Function in Java?

### 📚 Theoretical Background

In computer science, a **function** is a mapping from an input domain to an output range. Java 8 introduced the `Function<T, R>` interface from the `java.util.function` package to enable **first-class functional programming**.

A `Function<T, R>`:
- Accepts one input of type `T`
- Produces one output of type `R`

This interface allows you to represent behavior (logic) as data and pass it around.

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```

---

## 🧠 Key Characteristics

| Feature             | Description                                      |
|---------------------|--------------------------------------------------|
| `T`                 | Type of input                                    |
| `R`                 | Type of result                                   |
| `apply(T t)`        | Method to apply function                         |
| `andThen()`         | Chains a function to apply *after* current one   |
| `compose()`         | Chains a function to apply *before* current one  |
| `identity()`        | Returns input unchanged (`Function<T, T>`)       |

---

## ✅ Why Use `Function<T, R>`?

- **Clean, reusable** transformation logic
- Used heavily in **Stream API**
- Enables **DTO to Entity mapping**
- Enhances **testability** and **readability**

---

## 🧪 Basic Example

```java
Function<String, Integer> stringLength = str -> str.length();
int len = stringLength.apply("Java");
System.out.println(len);  // Output: 4
```

---

## 🔁 Function Composition

### `andThen()` — Apply current function, then the next one

```java
Function<Integer, Integer> doubleIt = x -> x * 2;
Function<Integer, Integer> addThree = x -> x + 3;

Function<Integer, Integer> result = doubleIt.andThen(addThree);
System.out.println(result.apply(4)); // (4*2) + 3 = 11
```

### `compose()` — Apply the given function, then the current one

```java
Function<Integer, Integer> composed = doubleIt.compose(addThree);
System.out.println(composed.apply(4)); // (4 + 3) * 2 = 14
```

---

## 🔍 andThen vs compose — Theoretical Difference

| Method      | Order of Execution                             | Result            |
|-------------|------------------------------------------------|-------------------|
| `andThen()` | **This function first**, then the next         | `g(f(x))`         |
| `compose()` | **Given function first**, then the current     | `f(g(x))`         |

### Mnemonics

- `f.andThen(g).apply(x)` → `g(f(x))`
- `f.compose(g).apply(x)` → `f(g(x))`

---

## 📊 Visual Explanation

```text
            andThen
x ───► [ f ] ───► [ g ] ───► g(f(x))

            compose
x ───► [ g ] ───► [ f ] ───► f(g(x))
```

---

## 📌 Real-Time Use Case Example

```java
Function<UserDTO, UserEntity> dtoToEntity = dto -> {
    UserEntity user = new UserEntity();
    user.setName(dto.getName());
    user.setAge(dto.getAge());
    return user;
};
```

Used in:
- **Microservices**
- **REST API mapping**
- **Business-layer pipelines**

---

## 📦 Variants of Function

| Interface             | Description                                      |
|------------------------|--------------------------------------------------|
| `Function<T, R>`       | One input, one output                           |
| `BiFunction<T, U, R>`  | Two inputs, one output                          |
| `UnaryOperator<T>`     | Same input and output type                      |
| `BinaryOperator<T>`    | Two same-type inputs, returns one output        |

---

## 🔁 Functional Stream Example

```java
List<String> names = List.of("Alice", "Bob", "Charlie");

List<Integer> nameLengths = names.stream()
                                 .map(str -> str.length())
                                 .collect(Collectors.toList());

System.out.println(nameLengths); // [5, 3, 7]
```

---

## 🧠 Practice Problems

### 🟢 Beginner
1. Implement a `Function<String, String>` to reverse a string.
2. Write a function to convert Celsius to Fahrenheit using `Function<Double, Double>`.
3. Use `Function<String, Integer>` to count vowels in a string.

### 🟡 Intermediate
4. Chain two functions: One doubles a number, the other squares it.
5. Implement a `Function<String, Boolean>` to check if a string is a palindrome.
6. Write a `Function<List<String>, Set<String>>` that removes duplicates.

### 🔴 Advanced
7. Build a generic function transformer pipeline using `compose` and `andThen`.
8. Create a caching system using `Map<K, V>` and a fallback loader as `Function<K, V>`.
9. Use `Function<UserDTO, Optional<UserEntity>>` with validation logic.

---

## 🧾 Summary

| Concept                    | Description                                              |
|-----------------------------|----------------------------------------------------------|
| `Function<T, R>`            | Interface to map input `T` to output `R`                |
| `apply(T)`                  | Executes the function                                    |
| `compose()` vs `andThen()`  | Order of function chaining differs                       |
| Enterprise Usage            | DTO conversion, validation, transformation pipelines     |
