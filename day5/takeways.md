# 📅 Day 5 Takeaways – Methods, Classes & Object-Oriented Basics

> *Today I learned how Java organizes code using classes and methods. Understanding the difference between class-level and local members, along with static and non-static concepts, gave me a strong foundation for Object-Oriented Programming (OOP).*

---

# 🚀 What I Learned

Day 5 focused on the building blocks of Java programming. I explored **Methods (Functions)**, understood the structure of a **Class**, learned about **Class Members**, and got an introduction to **Recursion**.

---

# 📖 Topics Covered

* Methods (Functions)
* Class (POJO - Plain Old Java Object)
* Class Members
* Class-Level Members
* Local-Level Members
* Data Members
* Member Methods
* Static Members
* Non-Static Members
* Introduction to Recursion

---

# 🔹 Methods (Functions)

A **method** is a block of code that performs a specific task.

### Why use methods?

* Avoid code duplication.
* Improve code readability.
* Reuse logic whenever needed.
* Make programs easier to maintain.

### Example

```java
public void display() {
    System.out.println("Hello Java");
}
```

---

# 🏛️ Class (POJO - Plain Old Java Object)

A **Class** is a blueprint used to create objects.

It contains all the members required for a particular use case, such as variables and methods.

### Example

Think of a **Bank**:

* **Bank** → Class
* **Account** → Object
* **Debit Division** → Member
* **Loan Division** → Member
* **Stock Division** → Member

A single class can contain multiple objects and members that work together.

---

# 🧩 Class Members

Class members are the components declared inside a class.

They include:

* Variables (Data Members)
* Methods (Member Methods)
* Objects

---

# 📂 Class-Level Members

Class-level members are declared directly inside a class and can be accessed throughout the class.

### Example

```java
class Bank {
    String bankName;
    int accountNumber;

    void display() {
        // Accessible anywhere inside the class
    }
}
```

### Key Points

* Declared outside methods.
* Accessible by all methods within the class.
* Exist as long as the object or class exists.

---

# 📍 Local-Level Members

Local members are declared inside a method or block.

### Example

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
}
```

Here,

* `Scanner sc` is a **local object**.
* It can only be used inside the `main()` method.

### Key Points

* Declared inside methods.
* Accessible only within that method.
* Destroyed after the method finishes execution.

---

# 📊 Data Members

Data members are variables declared inside a class.

They store information about an object.

### Example

```java
class Student {
    String name;
    int age;
}
```

---

# ⚙️ Member Methods

Member methods define the behavior of a class.

They perform operations using the class data.

### Example

```java
void displayDetails() {
    System.out.println(name);
}
```

---

# 🌐 Static Members

Static members belong to the **class**, not to individual objects.

### Characteristics

* Shared among all objects of the class.
* Created only once.
* Can be accessed using the class name.
* A static method cannot directly access non-static members without an object reference.

### Example

```java
class College {
    static String collegeName = "ABC College";
}
```

---

# 👤 Non-Static Members

Non-static members belong to individual objects.

### Characteristics

* Every object has its own copy.
* Can access both static and non-static members.
* Require an object to be accessed from outside the class.

### Example

```java
Student student = new Student();
student.name = "Revanth";
```

---

# 🔁 Recursion (Introduction)

Recursion is a technique where a method calls itself repeatedly until a stopping condition is reached.

### Basic Structure

```java
void display() {
    display();
}
```

In practical programs, recursion must always include a **base condition** to prevent infinite calls.

### Uses of Recursion

* Factorial calculation
* Fibonacci series
* Tree traversal
* Divide and conquer algorithms

---

# 🎯 Key Takeaways

* Learned how methods help organize and reuse code.
* Understood that a class acts as a blueprint for creating objects.
* Differentiated between class-level and local-level members.
* Learned the role of data members and member methods.
* Understood the difference between static and non-static members.
* Got a basic introduction to recursion and its importance.

---

# 📌 Reflection

Today's session strengthened my understanding of Java's object-oriented structure. Learning about classes, methods, static and non-static members helped me understand how Java programs are organized. The introduction to recursion also gave me a glimpse into solving complex problems using self-calling methods.

**Day 5 Complete ✅**
