<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" class="logo" width="120"/>

# Consumer Functional Interface in Java 8

## Overview

**Consumer** is a built-in functional interface introduced in Java 8, found in the `java.util.function` package[^1][^2][^3]. It represents an operation that takes a single input argument of type `T` and returns no result. This makes it ideal for scenarios where you want to process an object but don’t need to return anything, relying instead on side effects (such as printing, modifying values, saving to files, etc.)[^1][^2][^4].

- **Functional Interface Type:** Single Abstract Method (SAM)
- **Target Method (SAM):** `void accept(T t)`
- **Additional Method:** `default Consumer<T> andThen(Consumer<? super T> after)`


## Key Methods

| Method | Description |
| :-- | :-- |
| `void accept(T t)` | Performs this operation on the given argument |
| `default Consumer<T> andThen(Consumer<? super T> after)` | Composes two consumers to run in sequence: first this consumer, then the after-consumer[^1][^2][^3] |

## Functional Descriptor

$$
T \rightarrow ()
$$

This means: Takes an input of type `T`, performs an operation, and returns nothing.

## Use Cases

- Processing each element of a collection (e.g., printing, updating)
- Performing actions such as logging, notifications, etc. where no result needs to be returned
- Working with streams’ `forEach` method


## Examples

### 1. Using Lambda Expression

```java
import java.util.function.Consumer;

Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
printUpperCase.accept("java8"); // Output: JAVA8
```

This consumer takes a `String`, converts it to uppercase, and prints it[^3][^5][^6].

### 2. Applying Consumer to a Collection

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printNumber = num -> System.out.println("Number: " + num);

        list.forEach(printNumber); // Processes each element
    }
}
```

This example uses the Consumer interface to process each element in a list of integers[^2][^3][^5][^7].

### 3. Chaining Consumers with andThen()

```java
import java.util.function.Consumer;

Consumer<String> greet = name -> System.out.print("Hello, " + name);
Consumer<String> exclaim = name -> System.out.println("!");

Consumer<String> greetAndExclaim = greet.andThen(exclaim);
greetAndExclaim.accept("World"); // Output: Hello, World!
                                 //         !
```

The `andThen()` method allows you to chain consumers to process an item in sequence[^1][^2][^3][^8].

### 4. Consumer with User-defined Class (Example)

```java
import java.util.function.Consumer;

class Student {
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class StudentConsumerExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Priya");
        Student s2 = new Student(2, "Rahul");

        Consumer<Student> printStudent = student ->
            System.out.println(student.rollNo + ": " + student.name);

        printStudent.accept(s1);
        printStudent.accept(s2);
    }
}
// Output:
// 1: Priya
// 2: Rahul
```

Consumers are often used with custom objects in real-world applications[^6][^2].

## Summary Table

| Feature | Description |
| :-- | :-- |
| Package | `java.util.function` |
| Abstract Method | `accept(T t)` |
| Returns | void (no result) |
| Suitable for | Side-effect operations (logging, printing, etc.) |
| Chaining Supported | Yes, using `andThen()` |

## Notes

- **Consumer** is often used with lambda expressions and method references, which makes code concise and readable[^3].
- Unlike the `Function<T,R>` interface, **Consumer** does not return a value.
- Methods like `forEach` in collections and streams take consumers as arguments for processing elements[^2][^3][^7].


## References

- [^1]
- [^2]
- [^3]
- [^4]
- [^5]
- [^6]
- [^7]
- [^8]

**Downloadable Version**

You can copy this content as a `.md` file for your notes or reference.

<div style="text-align: center">⁂</div>

[^1]: https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html

[^2]: https://www.geeksforgeeks.org/java/java-8-consumer-interface-in-java-with-examples/

[^3]: https://mkyong.com/java8/java-8-consumer-examples/

[^4]: https://shivaprasadgurram.hashnode.dev/java-8s-consumer-predicate-and-supplier-functional-interfaces

[^5]: https://www.geekster.in/articles/function-interface-in-java/

[^6]: https://javagoal.com/java-consumer-and-java-consumer-example/

[^7]: https://www.javabrahman.com/java-8/java-8-java-util-function-consumer-tutorial-with-examples/

[^8]: https://examples.javacodegeeks.com/java8-functional-interface-consumer-tutorial/

[^9]: https://www.youtube.com/watch?v=5TxunNXY7LM

[^10]: https://java2blog.com/java-8-consumer-example/

[^11]: https://www.youtube.com/watch?v=KwaCankObLQ

[^12]: https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Javas-functional-Consumer-interface-example

[^13]: https://dzone.com/articles/functional-interface-explained-in-detail-introduce

[^14]: https://javarevisited.blogspot.com/2022/12/java-consumer-functional-interface.html

[^15]: https://gist.github.com/sunels/403525f90cb4e225780c4f2b5b0f6609

[^16]: https://www.baeldung.com/java-8-functional-interfaces

[^17]: https://blog.csdn.net/justlpf/article/details/130704698

[^18]: https://www.c-sharpcorner.com/article/java-8-functional-interfaces/

[^19]: https://www.youtube.com/watch?v=SejH4-4q5hA

[^20]: https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/consumer-functional-interface

