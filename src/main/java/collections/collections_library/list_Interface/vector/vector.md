Vector in Java
Quick Overview
- java.util.Vector is a legacy, thread-safe, growable array implementation of the List interface.
- All its public methods are synchronized, providing coarse-grained thread safety “out of the box.”
- By default, it doubles its capacity when full (growth factor of 100%), though you can supply a custom capacityIncrement.
- It supports both modern Iterator/ListIterator and legacy Enumeration.

Key Characteristics (Interview-Ready)
- Synchronization
- Every method (e.g., add(), remove(), get()) is synchronized on the Vector instance.
- This makes individual operations thread-safe, but compound actions (like “check-then-act”) still require external synchronization.
- Capacity Management
- Default behavior: new capacity = old capacity + (old capacity) ⇒ effectively doubling.
- Custom increment: new Vector<>(initialCapacity, capacityIncrement).
- If capacityIncrement > 0, growth = old + increment; if zero or unspecified, growth = old × 2.
- Performance Overhead
- Synchronization adds contention, making Vector slower than ArrayList in single-threaded contexts.
- Iteration via Enumeration isn’t fail-fast; it won’t detect concurrent modifications, risking subtle bugs.
- Iterator/ListIterator are fail-fast—throw ConcurrentModificationException if modCount changes outside the iterator.
- Legacy Methods
- elementAt(int), firstElement(), lastElement(), removeElement(Object).
- These coexist with List methods but are mostly unused in newer code.

Lesser-Known Details
- Protected removeRange() Hook
  Vector defines a protected void removeRange(int from, int to) in AbstractList. Subclasses can override to optimize bulk removals.
- Enumeration vs Iterator
- Enumeration was introduced in JDK 1.0; it doesn’t consult modCount, so it silently continues after external modifications—potentially reading removed elements.
- Iterator checks modCount on each next(), ensuring fail-fast behavior.
- modCount Visibility
  Even though individual operations are synchronized, modCount itself isn’t atomic across multiple methods. If two threads interleave operations on the same Vector, you can still get unexpected CMEs or stale data without extra locking.
- Garbage-Friendly Shrinkage
  Calling trimToSize() explicitly releases unused array slots. Vector never shrinks automatically when you remove elements—memory stays allocated until you call this.
- SubClassing Caveat
  If you subclass Vector and override synchronized methods without careful locking discipline, you can introduce subtle deadlocks or data races.

Sample Code
// Create with custom increment
Vector<String> v = new Vector<>(10, 5);

// Doubles capacity when full
for(int i=0; i<12; i++){
v.add("Item " + i);
}

// Legacy enumeration
Enumeration<String> e = v.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}

// Fail-fast iterator
Iterator<String> it = v.iterator();
while(it.hasNext()){
String s = it.next();
if(s.equals("Item 5")) v.remove(s);  // throws ConcurrentModificationException
}



Common Interview Questions & Sample Answers
- Q: How does Vector differ from ArrayList?
  A: Vector is synchronized; ArrayList isn’t. By default, both double capacity, but Vector supports a custom capacityIncrement and legacy methods like elementAt and Enumeration.
- Q: Is Vector’s thread safety enough for multi-step operations?
  A: No. While individual methods are synchronized, compound actions (e.g., if (!v.isEmpty()) v.remove(0)) need external synchronization to remain atomic.
- Q: When might you still use Vector today?
  A: Rarely in new code—Collections.synchronizedList(new ArrayList<>()) or CopyOnWriteArrayList offer more flexible or fine-grained thread safety. Vector survives mainly for backward compatibility.
- Q: Explain fail-fast vs fail-safe iteration in Vector.
  A: Iterator is fail-fast, tracking modCount; Enumeration is not, so it can miss concurrent modifications, which can lead to inconsistent reads.

Beyond the Basics
- Explore replacing Vector in legacy code with Deque implementations (e.g., LinkedList, ArrayDeque) when you need stack/queue behavior.
- Benchmark Vector vs. modern concurrent structures (ConcurrentLinkedQueue, CopyOnWriteArrayList) under different workloads to see real-world performance and scalability differences.
- Understand memory footprint: Vectors hold an Object[] and an int capacityIncrement—this modest overhead can accumulate in large-scale Java EE apps.
