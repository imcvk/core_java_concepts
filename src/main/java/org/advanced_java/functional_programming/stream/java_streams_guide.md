# Complete Guide to Java Streams

## Table of Contents
1. [Introduction to Streams](#introduction-to-streams)
2. [Stream Creation](#stream-creation)
3. [Stream Pipeline](#stream-pipeline)
4. [Intermediate Operations](#intermediate-operations)
5. [Terminal Operations](#terminal-operations)
6. [Parallel Streams](#parallel-streams)
7. [Best Practices](#best-practices)

## Introduction to Streams

### What are Streams?
Java Streams, introduced in Java 8, provide a functional programming approach to processing collections of data. A Stream is not a data structure but rather a sequence of elements that can be processed in a declarative way.

### Key Characteristics:
- **Not a data structure**: Streams don't store data; they convey elements from a source
- **Functional in nature**: Stream operations produce a result but don't modify the source
- **Laziness-seeking**: Many stream operations are lazy, meaning computation is deferred until needed
- **Possibly unbounded**: Unlike collections, streams can be infinite
- **Consumable**: Stream elements can only be visited once during the life of a stream

### Stream Pipeline
A stream pipeline consists of:
1. **Source**: Collection, array, generator function, or I/O channel
2. **Intermediate operations**: Transform the stream (lazy evaluation)
3. **Terminal operation**: Produces a result or side-effect

## Stream Creation

### From Collections
```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
Stream<String> parallelStream = list.parallelStream();
```

### From Arrays
```java
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);
Stream<String> partialStream = Arrays.stream(array, 1, 3); // from index 1 to 2
```

### Using Stream.of()
```java
Stream<String> stream = Stream.of("a", "b", "c");
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
```

### Empty Streams
```java
Stream<String> empty = Stream.empty();
```

### Infinite Streams
```java
// Generate infinite stream
Stream<Double> randoms = Stream.generate(Math::random);

// Iterate to create infinite stream
Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
```

### From Files
```java
try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
    lines.forEach(System.out::println);
}
```

## Stream Pipeline

### Basic Structure
```java
source.stream()
    .intermediateOperation1()
    .intermediateOperation2()
    .terminalOperation();
```

### Lazy Evaluation
Intermediate operations are lazy - they don't execute until a terminal operation is invoked.

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
Stream<String> stream = names.stream()
    .filter(name -> {
        System.out.println("Filtering: " + name);
        return name.length() > 3;
    })
    .map(name -> {
        System.out.println("Mapping: " + name);
        return name.toUpperCase();
    });

System.out.println("Stream created but no output yet");
stream.forEach(System.out::println); // Only now operations execute
```

## Intermediate Operations

Intermediate operations return a new stream and are always lazy. They can be stateless or stateful.

### 1. filter(Predicate<T> predicate)
**Purpose**: Filters elements based on a predicate
**Type**: Stateless

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filter even numbers
List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
// Result: [2, 4, 6, 8, 10]

// Filter strings by length
List<String> words = Arrays.asList("java", "python", "go", "javascript", "c");
List<String> longWords = words.stream()
    .filter(word -> word.length() > 3)
    .collect(Collectors.toList());
// Result: [java, python, javascript]
```

### 2. map(Function<T, R> mapper)
**Purpose**: Transforms each element using the provided function
**Type**: Stateless

```java
List<String> words = Arrays.asList("hello", "world", "java", "streams");

// Convert to uppercase
List<String> upperCase = words.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
// Result: [HELLO, WORLD, JAVA, STREAMS]

// Get string lengths
List<Integer> lengths = words.stream()
    .map(String::length)
    .collect(Collectors.toList());
// Result: [5, 5, 4, 7]

// Transform objects
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30)
);
List<String> names = people.stream()
    .map(Person::getName)
    .collect(Collectors.toList());
```

### 3. flatMap(Function<T, Stream<R>> mapper)
**Purpose**: Flattens nested structures into a single stream
**Type**: Stateless

```java
List<List<String>> listOfLists = Arrays.asList(
    Arrays.asList("a", "b"),
    Arrays.asList("c", "d", "e"),
    Arrays.asList("f")
);

// Flatten to single stream
List<String> flattened = listOfLists.stream()
    .flatMap(Collection::stream)
    .collect(Collectors.toList());
// Result: [a, b, c, d, e, f]

// Split strings and flatten
List<String> sentences = Arrays.asList("Hello World", "Java Streams", "Flat Map");
List<String> words = sentences.stream()
    .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
    .collect(Collectors.toList());
// Result: [Hello, World, Java, Streams, Flat, Map]
```

### 4. distinct()
**Purpose**: Removes duplicate elements
**Type**: Stateful

```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);

List<Integer> uniqueNumbers = numbers.stream()
    .distinct()
    .collect(Collectors.toList());
// Result: [1, 2, 3, 4, 5]

// With custom objects (requires proper equals/hashCode)
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Alice", 25)
);
List<Person> uniquePeople = people.stream()
    .distinct()
    .collect(Collectors.toList());
```

### 5. sorted() and sorted(Comparator<T> comparator)
**Purpose**: Sorts elements in natural order or using a comparator
**Type**: Stateful

```java
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

// Natural ordering
List<Integer> sorted = numbers.stream()
    .sorted()
    .collect(Collectors.toList());
// Result: [1, 2, 3, 5, 8, 9]

// Reverse order
List<Integer> reverseSorted = numbers.stream()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
// Result: [9, 8, 5, 3, 2, 1]

// Custom comparator
List<String> words = Arrays.asList("apple", "pie", "banana", "cherry");
List<String> sortedByLength = words.stream()
    .sorted(Comparator.comparing(String::length))
    .collect(Collectors.toList());
// Result: [pie, apple, banana, cherry]

// Multiple criteria sorting
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Alice", 20)
);
List<Person> sortedPeople = people.stream()
    .sorted(Comparator.comparing(Person::getName)
                     .thenComparing(Person::getAge))
    .collect(Collectors.toList());
```

### 6. peek(Consumer<T> action)
**Purpose**: Performs an action on each element without modifying the stream (debugging)
**Type**: Stateless

```java
List<String> words = Arrays.asList("hello", "world", "java");

List<String> result = words.stream()
    .peek(word -> System.out.println("Processing: " + word))
    .map(String::toUpperCase)
    .peek(word -> System.out.println("After mapping: " + word))
    .collect(Collectors.toList());

// Output during processing:
// Processing: hello
// After mapping: HELLO
// Processing: world
// After mapping: WORLD
// Processing: java
// After mapping: JAVA
```

### 7. limit(long maxSize)
**Purpose**: Truncates the stream to contain no more than maxSize elements
**Type**: Stateful (short-circuiting)

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> first5 = numbers.stream()
    .limit(5)
    .collect(Collectors.toList());
// Result: [1, 2, 3, 4, 5]

// With infinite stream
List<Integer> first10Even = Stream.iterate(0, n -> n + 2)
    .limit(10)
    .collect(Collectors.toList());
// Result: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
```

### 8. skip(long n)
**Purpose**: Skips the first n elements of the stream
**Type**: Stateful

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> skipFirst3 = numbers.stream()
    .skip(3)
    .collect(Collectors.toList());
// Result: [4, 5, 6, 7, 8, 9, 10]

// Pagination example
List<Integer> page2 = numbers.stream()
    .skip(5)  // Skip first 5
    .limit(3) // Take next 3
    .collect(Collectors.toList());
// Result: [6, 7, 8]
```

### 9. takeWhile(Predicate<T> predicate) - Java 9+
**Purpose**: Takes elements while the predicate is true
**Type**: Stateful (short-circuiting)

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);

List<Integer> takeWhileLessThan5 = numbers.stream()
    .takeWhile(n -> n < 5)
    .collect(Collectors.toList());
// Result: [1, 2, 3, 4] (stops at first 5, doesn't continue)
```

### 10. dropWhile(Predicate<T> predicate) - Java 9+
**Purpose**: Drops elements while the predicate is true, then takes the rest
**Type**: Stateful

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);

List<Integer> dropWhileLessThan5 = numbers.stream()
    .dropWhile(n -> n < 5)
    .collect(Collectors.toList());
// Result: [5, 4, 3, 2, 1] (drops until condition becomes false)
```

### 11. mapToInt/mapToLong/mapToDouble
**Purpose**: Maps to primitive streams for better performance
**Type**: Stateless

```java
List<String> strings = Arrays.asList("1", "2", "3", "4", "5");

// mapToInt
IntStream intStream = strings.stream()
    .mapToInt(Integer::parseInt);
int sum = intStream.sum(); // 15

// mapToDouble with Person objects
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30)
);
double averageAge = people.stream()
    .mapToDouble(Person::getAge)
    .average()
    .orElse(0.0);
```

### 12. flatMapToInt/flatMapToLong/flatMapToDouble
**Purpose**: FlatMaps to primitive streams
**Type**: Stateless

```java
List<List<Integer>> listOfLists = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5, 6)
);

int sum = listOfLists.stream()
    .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
    .sum(); // 21
```

## Terminal Operations

Terminal operations produce a result or side-effect and consume the stream.

### 1. forEach(Consumer<T> action)
**Purpose**: Performs an action for each element
**Returns**: void

```java
List<String> words = Arrays.asList("hello", "world", "java");

// Print each element
words.stream().forEach(System.out::println);

// Perform custom action
words.stream()
    .map(String::toUpperCase)
    .forEach(word -> System.out.println("Word: " + word));
```

### 2. forEachOrdered(Consumer<T> action)
**Purpose**: Performs an action for each element, preserving order (important for parallel streams)
**Returns**: void

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Parallel stream with ordered processing
numbers.parallelStream()
    .map(n -> n * 2)
    .forEachOrdered(System.out::println); // Maintains order: 2, 4, 6, 8, 10
```

### 3. collect(Collector<T, A, R> collector)
**Purpose**: Performs a mutable reduction using a Collector
**Returns**: R (result type)

```java
List<String> words = Arrays.asList("hello", "world", "java", "streams");

// Collect to List
List<String> upperWords = words.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());

// Collect to Set
Set<Integer> lengths = words.stream()
    .map(String::length)
    .collect(Collectors.toSet());

// Collect to Map
Map<String, Integer> wordLengths = words.stream()
    .collect(Collectors.toMap(
        word -> word,           // key mapper
        String::length         // value mapper
    ));

// Grouping
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Charlie", 25)
);
Map<Integer, List<Person>> peopleByAge = people.stream()
    .collect(Collectors.groupingBy(Person::getAge));

// Joining strings
String joined = words.stream()
    .collect(Collectors.joining(", ", "[", "]"));
// Result: "[hello, world, java, streams]"

// Partitioning
Map<Boolean, List<String>> partitioned = words.stream()
    .collect(Collectors.partitioningBy(word -> word.length() > 4));
// Result: {false=[java], true=[hello, world, streams]}
```

### 4. collect(Supplier<R> supplier, BiConsumer<R,T> accumulator, BiConsumer<R,R> combiner)
**Purpose**: Performs a mutable reduction with custom logic
**Returns**: R

```java
List<String> words = Arrays.asList("hello", "world", "java");

// Collect to StringBuilder
StringBuilder result = words.stream()
    .collect(
        StringBuilder::new,                    // supplier
        StringBuilder::append,                 // accumulator
        StringBuilder::append                  // combiner
    );

// Custom collection
List<String> customList = words.stream()
    .collect(
        ArrayList::new,                        // supplier
        (list, item) -> list.add(item.toUpperCase()), // accumulator
        (list1, list2) -> { list1.addAll(list2); return list1; } // combiner
    );
```

### 5. reduce(BinaryOperator<T> accumulator)
**Purpose**: Performs a reduction and returns Optional
**Returns**: Optional<T>

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Sum using reduce
Optional<Integer> sum = numbers.stream()
    .reduce((a, b) -> a + b);
// Or using method reference
Optional<Integer> sum2 = numbers.stream()
    .reduce(Integer::sum);

// Find maximum
Optional<Integer> max = numbers.stream()
    .reduce(Integer::max);

// String concatenation
List<String> words = Arrays.asList("hello", "world", "java");
Optional<String> concatenated = words.stream()
    .reduce((s1, s2) -> s1 + " " + s2);
// Result: Optional["hello world java"]
```

### 6. reduce(T identity, BinaryOperator<T> accumulator)
**Purpose**: Performs a reduction with an identity value
**Returns**: T

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Sum with identity
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b); // 15

// Product
int product = numbers.stream()
    .reduce(1, (a, b) -> a * b); // 120

// String joining with identity
List<String> words = Arrays.asList("hello", "world");
String result = words.stream()
    .reduce("Start: ", (s1, s2) -> s1 + s2 + " ");
// Result: "Start: hello world "
```

### 7. reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner)
**Purpose**: Performs a reduction with different types
**Returns**: U

```java
List<String> words = Arrays.asList("hello", "world", "java");

// Sum of string lengths
int totalLength = words.stream()
    .reduce(
        0,                              // identity
        (len, word) -> len + word.length(), // accumulator
        Integer::sum                    // combiner (for parallel processing)
    ); // Result: 14
```

### 8. min(Comparator<T> comparator) and max(Comparator<T> comparator)
**Purpose**: Find minimum/maximum element
**Returns**: Optional<T>

```java
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

Optional<Integer> min = numbers.stream().min(Integer::compareTo);
Optional<Integer> max = numbers.stream().max(Integer::compareTo);

// Custom comparator
List<String> words = Arrays.asList("apple", "pie", "banana");
Optional<String> shortest = words.stream()
    .min(Comparator.comparing(String::length));
Optional<String> longest = words.stream()
    .max(Comparator.comparing(String::length));

// With objects
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30)
);
Optional<Person> youngest = people.stream()
    .min(Comparator.comparing(Person::getAge));
```

### 9. count()
**Purpose**: Returns the count of elements
**Returns**: long

```java
List<String> words = Arrays.asList("hello", "world", "java", "streams");

long count = words.stream().count(); // 4

long longWords = words.stream()
    .filter(word -> word.length() > 4)
    .count(); // 2
```

### 10. anyMatch(Predicate<T> predicate)
**Purpose**: Returns true if any element matches the predicate
**Returns**: boolean (short-circuiting)

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

boolean hasEven = numbers.stream()
    .anyMatch(n -> n % 2 == 0); // true

boolean hasNegative = numbers.stream()
    .anyMatch(n -> n < 0); // false

List<String> words = Arrays.asList("hello", "world", "java");
boolean hasLongWord = words.stream()
    .anyMatch(word -> word.length() > 10); // false
```

### 11. allMatch(Predicate<T> predicate)
**Purpose**: Returns true if all elements match the predicate
**Returns**: boolean (short-circuiting)

```java
List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

boolean allEven = numbers.stream()
    .allMatch(n -> n % 2 == 0); // true

boolean allPositive = numbers.stream()
    .allMatch(n -> n > 0); // true

List<String> words = Arrays.asList("hello", "world");
boolean allShort = words.stream()
    .allMatch(word -> word.length() < 10); // true
```

### 12. noneMatch(Predicate<T> predicate)
**Purpose**: Returns true if no elements match the predicate
**Returns**: boolean (short-circuiting)

```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

boolean noneEven = numbers.stream()
    .noneMatch(n -> n % 2 == 0); // true

boolean noneNegative = numbers.stream()
    .noneMatch(n -> n < 0); // true

List<String> words = Arrays.asList("hi", "go", "up");
boolean noneLong = words.stream()
    .noneMatch(word -> word.length() > 5); // true
```

### 13. findFirst()
**Purpose**: Returns the first element
**Returns**: Optional<T> (short-circuiting)

```java
List<String> words = Arrays.asList("hello", "world", "java");

Optional<String> first = words.stream().findFirst();
// Result: Optional["hello"]

Optional<String> firstLong = words.stream()
    .filter(word -> word.length() > 4)
    .findFirst();
// Result: Optional["hello"]

// With empty stream
Optional<String> empty = Stream.<String>empty().findFirst();
// Result: Optional.empty
```

### 14. findAny()
**Purpose**: Returns any element (useful with parallel streams)
**Returns**: Optional<T> (short-circuiting)

```java
List<String> words = Arrays.asList("hello", "world", "java");

Optional<String> any = words.stream().findAny();
// Result: Optional["hello"] (or any element)

Optional<String> anyLong = words.parallelStream()
    .filter(word -> word.length() > 4)
    .findAny();
// Result: Optional["hello"] or Optional["world"] (non-deterministic in parallel)
```

### 15. toArray() and toArray(IntFunction<A[]> generator)
**Purpose**: Converts stream to array
**Returns**: Object[] or A[]

```java
List<String> words = Arrays.asList("hello", "world", "java");

// To Object array
Object[] array1 = words.stream().toArray();

// To typed array
String[] array2 = words.stream().toArray(String[]::new);

// With processing
String[] upperArray = words.stream()
    .map(String::toUpperCase)
    .toArray(String[]::new);
```

## Parallel Streams

### Creating Parallel Streams
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// From collection
Stream<Integer> parallelStream = numbers.parallelStream();

// Convert sequential to parallel
Stream<Integer> parallel = numbers.stream().parallel();

// Check if parallel
boolean isParallel = numbers.parallelStream().isParallel(); // true
```

### When to Use Parallel Streams
Parallel streams are beneficial when:
- Large datasets (>10,000 elements)
- CPU-intensive operations
- Stateless operations
- Associative operations

### Example: Performance Comparison
```java
List<Integer> largeList = IntStream.rangeClosed(1, 10_000_000)
    .boxed()
    .collect(Collectors.toList());

// Sequential
long start = System.currentTimeMillis();
long sequentialSum = largeList.stream()
    .mapToLong(i -> i * i)
    .sum();
long sequentialTime = System.currentTimeMillis() - start;

// Parallel
start = System.currentTimeMillis();
long parallelSum = largeList.parallelStream()
    .mapToLong(i -> i * i)
    .sum();
long parallelTime = System.currentTimeMillis() - start;

System.out.println("Sequential: " + sequentialTime + "ms");
System.out.println("Parallel: " + parallelTime + "ms");
```

## Best Practices

### 1. Prefer Method References
```java
// Instead of lambda
words.stream().map(word -> word.toUpperCase())

// Use method reference
words.stream().map(String::toUpperCase)
```

### 2. Use Appropriate Collectors
```java
// Collecting to List
List<String> result = stream.collect(Collectors.toList());

// Better: specify implementation if needed
List<String> result = stream.collect(Collectors.toCollection(ArrayList::new));
```

### 3. Avoid Side Effects in Lambda Expressions
```java
// Bad: modifying external state
List<String> result = new ArrayList<>();
words.stream().filter(word -> word.length() > 3)
              .forEach(result::add); // Side effect

// Good: use collect
List<String> result = words.stream()
    .filter(word -> word.length() > 3)
    .collect(Collectors.toList());
```

### 4. Use Primitive Streams for Performance
```java
// Instead of
int sum = numbers.stream()
    .mapToInt(Integer::intValue)
    .boxed()
    .mapToInt(Integer::intValue)
    .sum();

// Use
int sum = numbers.stream()
    .mapToInt(Integer::intValue)
    .sum();
```

### 5. Handle Optional Properly
```java
// Good
Optional<String> result = words.stream()
    .filter(word -> word.length() > 10)
    .findFirst();

if (result.isPresent()) {
    System.out.println(result.get());
}

// Or better
words.stream()
    .filter(word -> word.length() > 10)
    .findFirst()
    .ifPresent(System.out::println);
```

### 6. Consider Lazy Evaluation
```java
// Operations are lazy until terminal operation
Stream<String> processed = words.stream()
    .filter(word -> word.length() > 3)  // Not executed yet
    .map(String::toUpperCase);          // Not executed yet

// Only now are the operations executed
List<String> result = processed.collect(Collectors.toList());
```

### 7. Use Parallel Streams Judiciously
```java
// Good for CPU-intensive tasks with large datasets
List<Integer> results = largeList.parallelStream()
    .filter(n -> isPrime(n))  // CPU-intensive
    .collect(Collectors.toList());

// Avoid for I/O operations or small datasets
List<String> results = smallList.stream()  // Use sequential
    .map(this::callWebService)             // I/O operation
    .collect(Collectors.toList());
```

This comprehensive guide covers all major aspects of Java Streams, from basic concepts to advanced usage patterns. Each operation includes practical examples and explanations to help you understand when and how to use them effectively.