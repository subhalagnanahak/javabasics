# Java Fundamentals & Object-Oriented Programming

> Object-Oriented Programming (OOP) is a methodology or paradigm to design a program using **classes and objects**. It simplifies software development and maintenance.

**Core Pillars:** Inheritance · Polymorphism · Abstraction · Encapsulation

---

## Table of Contents

- [Data Types](#data-types)
- [Wrapper Classes](#wrapper-classes)
- [Operators & Precedence](#operators--precedence)
- [Naming Conventions](#naming-conventions)
- [Object vs Class](#object-vs-class)
- [Constructors vs Methods](#constructors-vs-methods)
- [Inheritance](#inheritance)
- [Association, Aggregation & Composition](#association-aggregation--composition)
- [Polymorphism](#polymorphism)
- [Abstract Class vs Interface](#abstract-class-vs-interface)
- [Access Modifiers](#access-modifiers)
- [Abstraction vs Encapsulation](#abstraction-vs-encapsulation)
- [Object Class Methods](#object-class-methods)

---

## Data Types

| Data Type | Default Value | Size   |
|-----------|---------------|--------|
| `boolean` | `false`       | 1 bit  |
| `char`    | `'\u0000'`    | 2 byte |
| `byte`    | `0`           | 1 byte |
| `short`   | `0`           | 2 byte |
| `int`     | `0`           | 4 byte |
| `long`    | `0L`          | 8 byte |
| `float`   | `0.0f`        | 4 byte |
| `double`  | `0.0d`        | 8 byte |

> **Note:** UTF-8 is the most popular Unicode character encoding, used by ~90% of websites.

### Data Type Promotion

Smaller types are automatically promoted to larger types in expressions:

```
byte → short → int → long → float → double
                char ↗
```

---

## Wrapper Classes

| Primitive | Wrapper Class |
|-----------|---------------|
| `boolean` | `Boolean`     |
| `char`    | `Character`   |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |

---

## Operators & Precedence

| Operator Type | Category              | Symbols                              |
|---------------|-----------------------|--------------------------------------|
| Unary         | postfix               | `expr++` `expr--`                    |
|               | prefix                | `++expr` `--expr` `+expr` `-expr` `~` `!` |
| Arithmetic    | multiplicative        | `*` `/` `%`                          |
|               | additive              | `+` `-`                              |
| Shift         | shift                 | `<<` `>>` `>>>`                      |
| Relational    | comparison            | `<` `>` `<=` `>=` `instanceof`       |
|               | equality              | `==` `!=`                            |
| Bitwise       | AND                   | `&`                                  |
|               | exclusive OR          | `^`                                  |
|               | inclusive OR          | `\|`                                 |
| Logical       | AND                   | `&&`                                 |
|               | OR                    | `\|\|`                               |
| Ternary       | ternary               | `? :`                                |
| Assignment    | assignment            | `=` `+=` `-=` `*=` `/=` `%=` etc.   |

---

## Naming Conventions

| Element    | Convention                                        | Example                         |
|------------|---------------------------------------------------|---------------------------------|
| Class      | UpperCamelCase, noun                              | `String`, `Button`, `Thread`    |
| Interface  | UpperCamelCase, adjective                         | `Runnable`, `ActionListener`    |
| Method     | lowerCamelCase, verb                              | `main()`, `actionPerformed()`   |
| Variable   | lowerCamelCase                                    | `firstName`, `orderNumber`      |
| Package    | all lowercase                                     | `java.lang`, `java.util`        |
| Constant   | UPPER_SNAKE_CASE                                  | `MAX_PRIORITY`, `RED`           |

---

## Object vs Class

| Object                                          | Class                                          |
|-------------------------------------------------|------------------------------------------------|
| An instance of a class                          | A blueprint/template for creating objects      |
| Real-world entity (pen, chair, laptop…)         | A group of similar objects                     |
| Physical entity                                 | Logical entity                                 |
| Created with `new` keyword: `Student s = new Student();` | Declared once with `class` keyword: `class Student {}` |
| Can be created many times                       | Declared only once                             |
| Allocates memory when created                   | Doesn't allocate memory on declaration         |
| Multiple creation methods: `new`, `newInstance()`, `clone()`, factory, deserialization | Only one way — using `class` keyword |

---

## Constructors vs Methods

| Constructor                                       | Method                                         |
|---------------------------------------------------|------------------------------------------------|
| Initializes the state of an object                | Exposes behaviour of an object                 |
| No return type                                    | Must have a return type                        |
| Invoked implicitly                                | Invoked explicitly                             |
| Compiler provides a default if none defined       | Never provided by the compiler                 |
| Name must match the class name                    | Name may or may not match the class name       |

---

## Inheritance

### Supported Through Classes
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance

### Supported Through Interfaces Only
- Multiple Inheritance
- Hybrid Inheritance

---

## Association, Aggregation & Composition

**Association** — a general relationship between two classes (uses-a or has-a).

### Aggregation vs Composition

| Aggregation                                  | Composition                                  |
|----------------------------------------------|----------------------------------------------|
| Weak association                             | Strong association                           |
| Child can exist independently                | Child cannot exist without the owner         |
| Child has its own lifetime                   | Child lifetime depends on the owner          |
| "A uses B" / Has-A                           | "B is part of A" / Part-Of                   |
| Child can have multiple owners               | Child has exactly one owner                  |
| Empty diamond `◇` in UML                    | Filled diamond `◆` in UML                   |
| `final` keyword NOT used                     | `final` keyword used to ensure initialization |
| **e.g.** Car has a Driver, Company has People | **e.g.** Engine is part of Car, Heart owned by Human |

---

## Polymorphism

### Method Overloading vs Method Overriding

| Method Overloading                                    | Method Overriding                                         |
|-------------------------------------------------------|-----------------------------------------------------------|
| Increases readability of the program                  | Provides specific implementation of a superclass method   |
| Performed within the same class                       | Occurs across two classes with IS-A (inheritance) relationship |
| Parameters **must be different**                      | Parameters **must be the same**                           |
| Compile-time polymorphism                             | Run-time polymorphism                                     |
| Return type can be same or different, but params must differ | Return type must be same or covariant              |

---

## Abstract Class vs Interface

| Abstract Class                                       | Interface                                              |
|------------------------------------------------------|--------------------------------------------------------|
| Can have abstract and non-abstract methods           | Can have only abstract methods (+ `default`/`static` from Java 8) |
| Does **not** support multiple inheritance            | Supports multiple inheritance                          |
| Can have `final`, non-final, static, non-static vars | Only `static` and `final` variables                    |
| Can provide implementation of interface              | Cannot provide implementation of abstract class        |
| Declared with `abstract` keyword                     | Declared with `interface` keyword                      |

```java
// Abstract Class
public abstract class Shape {
    public abstract void draw();
}

// Interface
public interface Drawable {
    void draw();
}
```

---

## Access Modifiers

| Modifier    | Same Class | Same Package | Subclass (outside pkg) | Outside Package |
|-------------|:----------:|:------------:|:----------------------:|:---------------:|
| `private`   | ✅         | ❌           | ❌                     | ❌              |
| default     | ✅         | ✅           | ❌                     | ❌              |
| `protected` | ✅         | ✅           | ✅                     | ❌              |
| `public`    | ✅         | ✅           | ✅                     | ✅              |

---

## Abstraction vs Encapsulation

| Abstraction                                              | Encapsulation                                          |
|----------------------------------------------------------|--------------------------------------------------------|
| Hides implementation details, shows only functionality   | Wraps code and data into a single unit                 |
| Focus on *what* the object does                          | Provides control over data, keeping it safe            |
| Solves problems at the **Design** level                  | Solves problems at the **Implementation** level        |
| Implemented via Interfaces & Abstract Classes            | Implemented via Access Modifiers                       |
| Hides complexity using interfaces/abstract classes       | Hides data using getters and setters                   |

---

## Object Class Methods

The `Object` class is the **parent of all Java classes** by default.

| Method | Description |
|--------|-------------|
| `public final Class getClass()` | Returns the runtime class of this object |
| `public int hashCode()` | Returns the hash code number for this object |
| `public boolean equals(Object obj)` | Compares the given object to this object |
| `protected Object clone()` | Creates and returns an exact copy (clone) of this object |
| `public String toString()` | Returns the string representation of this object |
| `public final void notify()` | Wakes up a single thread waiting on this object's monitor |
| `public final void notifyAll()` | Wakes up all threads waiting on this object's monitor |
| `public final void wait(long timeout)` | Causes current thread to wait for specified milliseconds |
| `public final void wait(long timeout, int nanos)` | Causes current thread to wait for specified ms and ns |
| `public final void wait()` | Causes current thread to wait until notified |
| `protected void finalize()` | Invoked by GC before the object is garbage collected |
