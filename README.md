# 📘 Learning Java

A collection of Java practice programs, algorithms, and core concept implementations for mastering fundamentals step-by-step.

---

## 📑 Table of Contents
- [Basic Java Template](#-basic-java-template)
- [Hashing & Hash Tables](#-hashing--hash-tables)
- [Sorting Algorithms](#-sorting-algorithms)
- [Time & Space Complexity](#-time--space-complexity)
- [Searching Algorithms](#-searching-algorithms)
- [Object-Oriented Programming](#-object-oriented-programming)
- [Types of Loops in Java](#-types-of-loops-in-java)
- [Java Collection Framework](#-java-collection-frame-works)


---

## 💻 Basic Java Template
```java
class Main {
    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}
```

---

## 🔑 Hashing & Hash Tables

**Hashing** maps data (keys) to a fixed-size value using a hash function.  
This value is used as an index for fast data access.

### 📦 Hash Table
Stores **key–value pairs** and provides average **O(1)** time for:
- Insertion
- Deletion
- Lookup

### ⚙️ How It Works
1. Hash function converts key → array index  
2. Value stored at that index  
3. Same hash function used to retrieve it  

### ⚠️ Collisions
Occurs when two keys map to the same index.

**Handling Methods**
- **Chaining** → Store multiple values at same index (list)
- **Open Addressing** → Find another empty slot

### ⭐ Advantages
- Faster access than arrays & linked lists  
- Efficiency depends on hash function quality  

**Used in:**
- Databases
- Caches
- Dictionaries / Maps

---

## 🔄 Sorting Algorithms

Implemented with focus on clarity + fundamentals:

- Selection Sort
- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort

---

## ⏱ Time & Space Complexity

| Algorithm | Best | Average | Worst | Space |
|--------|------|---------|-------|------|
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) |

---

## 🔎 Searching Algorithms

### Linear Search
```
LinearSearch(A, n, key)
  for i ← 0 to n - 1 do
      if A[i] = key then
          return i
  return -1
```

### Binary Search
```
BinarySearch(array, target):
  low ← 0
  high ← length(array) - 1

  while low ≤ high:
      mid ← low + (high - low) / 2

      if array[mid] == target:
          return mid
      else if array[mid] < target:
          low ← mid + 1
      else:
          high ← mid - 1

  return -1
```

---

## 🧠 Object-Oriented Programming

OOP models real-world entities as **objects** containing:

- Properties (data)
- Behaviors (methods)

---

### 🧱 Four Pillars of OOP

#### 1️⃣ Encapsulation
Wraps data + methods into a class and restricts direct access.

```java
class Student {
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
```

---

#### 2️⃣ Inheritance
Allows a class to inherit properties and behaviors from another.

```java
class Animal {
    String name;
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}
```

**Types of Inheritance**
- Single  
- Multiple  
- Multilevel  
- Hierarchical  
- Hybrid  

---

#### 3️⃣ Polymorphism
Same method name → different behavior.

```java
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // reference is Animal, object is Dog
        a.sound();

        a = new Cat();  // reference is Animal, object is Cat
        a.sound();
    }
}
```

**Types**
- Compile-time → Method Overloading  
- Runtime → Method Overriding  

---

#### 4️⃣ Abstraction
Shows only essential features and hides internal implementation details.

```java
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();
    
    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Woof Woof!
        myDog.sleep();     // Output: Sleeping...
    }
}
```

##  📌 Types of Loops in Java

Java mainly provides three types of loops:
- for loop 
- while loop 
- do-while loop 

#### 1 For Loop Syntax in Java
```java
for (initialization; condition; update) {
    // code to run each loop
}
```

#### 2 While Loop Syntax in Java
```java
while (condition) {
    // code to execute repeatedly
}
```

#### 3 Do While Loop Syntax in Java
```java
do {
    // code to be executed
} while (condition);
```

## For - Each Loop 
the for-each loop (also called the enhanced for loop) is used to iterate through arrays or collections easily without using an index.

```java
for (datatype variable : arrayOrCollection) {
    // code to execute
}
```

## Java Collection Frame Works
The Java Collections Framework (JCF) is a set of classes and interfaces in Java that help you store, manage, and manipulate groups of objects efficiently. It is part of the Java standard library (java.util package).

Instead of writing your own data structures, Java provides ready-made structures like lists, sets, queues, and maps.

#### The main interfaces in the Collection Framework are:

#### Collection

- List : List is an interface in the Java Collection Framework that represents an ordered collection of elements where duplicates are allowed and elements can be accessed using an index.

- Set : A Set is a collection that does not allow duplicate elements and typically does not guarantee insertion order (depending on the implementation).

- Queue : A Queue in the Java Collections Framework is an interface that represents a collection of elements designed to be processed in a First-In-First-Out (FIFO) order, where elements are inserted at the rear and removed from the front.

- Map (separate interface for key-value storage) : There are map used to store data in Java! A map is an object that stores elements in key-value pairs, where each key is unique and is used to access its corresponding value.
* HashMap
```java
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "Apple");
        map.put("2", "Banana");
        map.put("3", "Mango");

        System.out.println(map.get("2"));  // Banana

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```
* LinkedHashMap
```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        
        // Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(2, "Mango");

        // Print map (in insertion order)
        System.out.println("LinkedHashMap: " + map);

        // Access element
        System.out.println("Value at key 2: " + map.get(2));

        // Remove element
        map.remove(3);

        // Iterate through map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```
* TreeMap
```java
import java.util.TreeMap;

public class TreeMapBasic {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        // Add
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Mango", 1);

        // Get
        System.out.println(map.get("Apple"));   // 5

        // Sorted output
        System.out.println(map);                // {Apple=5, Banana=2, Mango=1}

        // Remove
        map.remove("Banana");
        System.out.println(map);                // {Apple=5, Mango=1}
    }
}
```
* HashTable
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Mango", 80);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Access value using key
        System.out.println("Price of Apple: " + map.get("Apple"));

        // Check if key exists
        System.out.println("Contains Banana? " + map.containsKey("Banana"));

        // Remove an item
        map.remove("Banana");

        // Print after removal
        System.out.println("After removing Banana: " + map);

        // Loop through HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```
* ConcurrentHashMap
```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // put values
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // get values
        System.out.println("Apple stock: " + map.get("Apple"));

        // update value
        map.put("Apple", 15);

        // remove value
        map.remove("Banana");

        // print map
        System.out.println("Final Map: " + map);
    }
}
```

