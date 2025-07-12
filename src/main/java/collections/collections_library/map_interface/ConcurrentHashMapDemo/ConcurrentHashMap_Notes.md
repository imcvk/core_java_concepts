
# 📦 ConcurrentHashMap in Java - Complete Notes

## 🔥 What is ConcurrentHashMap?

- Part of `java.util.concurrent` package
- A **thread-safe**, high-performance implementation of `HashMap`
- Allows concurrent reads and controlled concurrent writes
- Designed for use in **multi-threaded environments**
- **Does NOT allow null keys or null values**
- Provides better performance than `Hashtable` by using finer-grained locking

---

## 🏗️ Basic Syntax

```java
import java.util.concurrent.ConcurrentHashMap;

ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
```

---

## ⚡ Key Features

✅ Multiple threads can safely read without blocking  
✅ Thread-safe insert, update, delete operations  
✅ Prevents null keys and null values  
✅ Efficient locking with segment or bucket-level locking  
✅ Iterators are **weakly consistent**, avoiding `ConcurrentModificationException`  

---

## 🛠️ Important Methods in ConcurrentHashMap

| Method                                  | Description                                  |
|-----------------------------------------|----------------------------------------------|
| `put(K key, V value)`                   | Adds or updates a key-value pair             |
| `get(Object key)`                       | Retrieves the value for the given key        |
| `putIfAbsent(K key, V value)`           | Adds entry only if key is absent             |
| `remove(Object key, Object value)`      | Removes entry if key-value pair matches      |
| `replace(K key, V oldValue, V newValue)`| Replaces value only if old value matches     |
| `forEach()`                             | Safe iteration over map entries              |
| `size()`                                | Returns the number of entries in map         |
| `containsKey(Object key)`               | Checks if key exists                         |
| `containsValue(Object value)`           | Checks if value exists                       |
| `clear()`                               | Removes all entries from the map             |
| `isEmpty()`                             | Checks if map is empty                       |

---

## 🧩 Example Usage

```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println(map);

        String lang = map.get(2);
        System.out.println("Language at key 2: " + lang);

        map.putIfAbsent(3, "Go");
        System.out.println("After putIfAbsent: " + map);

        boolean removed = map.remove(2, "Python");
        System.out.println("Removed? " + removed);

        System.out.println("Final Map: " + map);
    }
}
```

---

## 🔧 Internal Working

### Java 7
- **Segment-based locking**
- Map divided into segments (default 16)
- Allows multiple threads to work on different segments

### Java 8+
- **Bucket-level locking**
- Uses `Node[]` array like `HashMap`
- Lock-free reads using volatile variables and CAS (Compare-And-Swap)
- Fine-grained control over updates

---

## ⚡ ConcurrentHashMap vs Hashtable

| Feature              | ConcurrentHashMap              | Hashtable                        |
|----------------------|---------------------------------|-----------------------------------|
| Thread-Safety        | High concurrency with fine locks| Entire map locked for all ops     |
| Performance          | Efficient under high concurrency| Poor for multi-threaded scenarios|
| Null Handling        | No null keys/values             | Allows null values (keys restricted) |
| Internal Design      | Bucket-level/CAS operations     | Synchronized at method level      |

---

## 🚀 Use Cases

✔️ Multi-threaded caches  
✔️ Real-time analytics or monitoring tools  
✔️ Web servers needing shared state  
✔️ Safe shared data across threads  

---

## ⚠️ Limitations

- No ordering guarantee (like `HashMap`)  
- Cannot store `null` keys or values  
- Iterators are **weakly consistent**, no `ConcurrentModificationException`  

---

## 📝 Example - Concurrent Access

```java
import java.util.concurrent.*;

public class ConcurrentAccessDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Runnable writer = () -> {
            for (int i = 0; i < 100; i++) {
                map.put(i, "Value " + i);
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 100; i++) {
                map.get(i);
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(writer);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Map size: " + map.size());
    }
}
```

---

## 🎯 Interview Quick Points

✅ Thread-safe, efficient map for concurrent environments  
✅ Disallows `null` keys and values  
✅ Uses finer-grained locking mechanisms (Java 8+)  
✅ Weakly consistent iterators (safe but may reflect partial updates)  
✅ Preferred over `Hashtable` for high-concurrency scenarios  

---
