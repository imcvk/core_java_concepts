# 🌳 TreeMap in Java

`TreeMap` is a part of Java’s `java.util` package and implements the `NavigableMap` interface. It stores key-value pairs
with keys automatically sorted using natural ordering or a custom `Comparator`.

---

## 🧠 Core Concepts

- Based on a **Red-Black Tree** (self-balancing BST).
- Keys are **sorted**.
- **No null key** allowed (but null values are fine).
- Implements **NavigableMap** for range queries.
- Time complexity for operations: **O(log n)**.

---

## 🔧 Common Operations

```java
TreeMap<String, Integer> map = new TreeMap<>();

// Insert
map.

put("Banana",40);
map.

put("Apple",30);
map.

put("Cherry",50);

// Output: {Apple=30, Banana=40, Cherry=50}
System.out.

println(map);

// Access
System.out.

println(map.get("Banana")); // 40

// Navigation
        System.out.

println(map.firstKey());         // Apple
        System.out.

println(map.lastEntry());        // Cherry=50
        System.out.

println(map.higherKey("Banana")); // Cherry
```

---

## ⚔️ TreeMap vs HashMap vs LinkedHashMap

| Feature      | TreeMap        | HashMap                | LinkedHashMap           |
|--------------|----------------|------------------------|-------------------------|
| Ordering     | Sorted by keys | No ordering            | Insertion order         |
| Performance  | O(log n)       | O(1) avg.              | O(1) avg.               |
| Null Key     | ❌ Not allowed  | ✅ One null key allowed | ✅ One null key allowed  |
| Backing Data | Red-Black Tree | Hash Table             | Hash Table + LinkedList |

---

## 🧩 When to Use TreeMap

Use `TreeMap` when:

- You want keys to remain **sorted automatically**.
- You need **range-based access** (e.g., keys greater than X).
- You're building **sorted dictionaries**, **leaderboards**, or require **custom comparators**.

---

## 📚 NavigableMap Utility Methods

| Method              | Description                               |
|---------------------|-------------------------------------------|
| `firstKey()`        | Lowest key                                |
| `lastKey()`         | Highest key                               |
| `higherKey(K key)`  | Least key strictly greater than given key |
| `lowerKey(K key)`   | Greatest key strictly less than given key |
| `ceilingKey(K key)` | Least key greater than or equal to key    |
| `floorKey(K key)`   | Greatest key less than or equal to key    |

---
