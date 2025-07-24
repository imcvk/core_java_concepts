# 🚦 BlockingQueue in Java

## 🔍 What Is a BlockingQueue?

A **BlockingQueue** is a thread-safe queue that **blocks**:
- When inserting into a **full** queue
- When removing from an **empty** queue

It’s ideal for **producer-consumer** scenarios and is part of `java.util.concurrent`.

---

## 🧠 How It Works

![BlockingQueue Diagram](https://javapapers.com/wp-content/uploads/2013/10/blockingqueue-java.png)  
*Source: [Javapapers](https://javapapers.com/java/java-blockingqueue/)*

- **Producer thread** uses `put()` → waits if queue is full
- **Consumer thread** uses `take()` → waits if queue is empty

---

## 🛠️ Core Methods

### 🔹 Insertion
| Method | Behavior |
|--------|----------|
| `add(E e)` | Throws exception if full |
| `offer(E e)` | Returns `false` if full |
| `put(E e)` | Blocks until space is available |
| `offer(E e, timeout, unit)` | Waits for space up to timeout |

### 🔹 Removal
| Method | Behavior |
|--------|----------|
| `remove()` | Throws exception if empty |
| `poll()` | Returns `null` if empty |
| `take()` | Blocks until element is available |
| `poll(timeout, unit)` | Waits for element up to timeout |

### 🔹 Utility
| Method | Description |
|--------|-------------|
| `peek()` | Views head without removing |
| `size()` | Returns current size |
| `contains(Object o)` | Checks for presence |
| `clear()` | Empties the queue |

---

## 🧩 Specific Methods in BlockingQueue

These methods are **unique to the BlockingQueue interface** and enhance concurrency control:

### 🔸 Capacity & Blocking Control
| Method | Description |
|--------|-------------|
| `put(E e)` | Blocks if queue is full |
| `take()` | Blocks if queue is empty |
| `offer(E e, long timeout, TimeUnit unit)` | Waits for space |
| `poll(long timeout, TimeUnit unit)` | Waits for element |
| `remainingCapacity()` | Returns available slots |

### 🔸 Bulk Transfer
| Method | Description |
|--------|-------------|
| `drainTo(Collection<? super E> c)` | Transfers all available elements |
| `drainTo(Collection<? super E> c, int maxElements)` | Transfers up to `maxElements` |

---

## 🧪 Java Example

```java
BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

// Producer thread
new Thread(() -> {
    try {
        queue.put("Java");
        queue.put("Spring");
        queue.put("Concurrency"); // Blocks until space is available
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}).start();

// Consumer thread
new Thread(() -> {
    try {
        Thread.sleep(2000); // Simulate delay
        System.out.println(queue.take()); // "Java"
        System.out.println(queue.take()); // "Spring"
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}).start();
