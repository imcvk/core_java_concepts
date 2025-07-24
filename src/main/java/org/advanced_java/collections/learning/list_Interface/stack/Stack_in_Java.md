# 📚 Stack in Java – Complete Guide

## 🔹 What is Stack?

A **Stack** is a linear data structure that follows the **LIFO** (Last-In-First-Out) principle. In Java, the `Stack`
class is part of the `java.util` package and extends the `Vector` class.

---

## 🔹 Stack Declaration

```java
Stack<Type> stack = new Stack<>();
```

Example:

```java
Stack<String> stack = new Stack<>();
```

---

## 🔹 Commonly Used Methods of `Stack`

| Method Signature             | Description                                                  |
|------------------------------|--------------------------------------------------------------|
| `boolean empty()`            | Checks if the stack is empty                                 |
| `E peek()`                   | Returns the top element without removing it                  |
| `E pop()`                    | Removes and returns the top element                          |
| `E push(E item)`             | Pushes an item onto the top of the stack                     |
| `int search(Object o)`       | Returns 1-based position from top of stack if found, else -1 |
| `int size()`                 | Returns the number of elements in the stack                  |
| `boolean contains(Object o)` | Checks if the stack contains the specified element           |
| `E get(int index)`           | Returns the element at the specified position                |
| `void clear()`               | Removes all elements from the stack                          |
| `Iterator<E> iterator()`     | Returns an iterator over the stack elements                  |
| `Object[] toArray()`         | Returns an array containing all elements in the stack        |

---

## 🔹 Example Usage

```java
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Top Element: " + stack.peek());    // C
        System.out.println("Is Empty? " + stack.empty());      // false
        System.out.println("Pop: " + stack.pop());             // C
        System.out.println("Contains A? " + stack.contains("A")); // true
        System.out.println("Index of B: " + stack.search("B"));   // 1
        System.out.println("Size: " + stack.size());           // 2

        stack.clear();  // Clears the stack
        System.out.println("Size after clear: " + stack.size()); // 0
    }
}
```

---

## 🔹 Real-Time Use Cases of Stack

- **Undo/Redo** functionality in editors
- **Back/Forward** navigation in web browsers
- **Function call stack** in recursion
- **Expression evaluation** (postfix/prefix)
- **Syntax validation** (balanced parentheses, etc.)
- **Graph traversal** using DFS
