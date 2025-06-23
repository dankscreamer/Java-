# ☕ How Java Works – Beginner Notes

This document explains how Java programs work at a fundamental level — focusing on the structure, the `main` method, and how the Java Virtual Machine (JVM) executes code.

---

## 📌 Basic Java Structure

In Java, everything starts with a **class**.

```java
class Main {
    public static void main(String[] args) {
        // your code here
    }
}
```

- The class name can be anything (e.g., `Main`, `HelloWorld`, `MyProgram`).
- It does **not need to match the file name** unless the class is `public`.

---

## 🚀 Role of `public static void main(String[] args)`

This line is the **entry point** of any Java application. The JVM is programmed to look for this specific method to start execution.

### 🔍 Let's break it down:

```java
public static void main(String[] args)
```

| Keyword      | Purpose                                                                 |
|--------------|-------------------------------------------------------------------------|
| `public`     | The method is accessible by the JVM from anywhere.                      |
| `static`     | The method belongs to the class, not an object.                         |
| `void`       | The method doesn’t return anything.                                     |
| `main`       | This is the name that JVM looks for to start running the program.       |
| `String[] args` | An array of command-line arguments passed to the program.           |

---

## ⚠️ Important Notes

- If you define two classes with the same name (e.g., `class Main`) in the same directory, the compiler will overwrite the `.class` file and cause errors.
- Always use **unique class names** within a directory to avoid conflicts.
- If multiple classes have a `main` method, you must specify which one to run:
  
  ```bash
  java ClassName
  ```

- Example:
  
  ```bash
  javac HelloWorld.java
  java HelloWorld
  ```

---

## ✅ Summary

- Java programs must have a `main` method for the JVM to begin execution.
- `public static void main(String[] args)` is the required signature.
- Class names should be unique across files in the same directory to prevent compile-time conflicts.

---
```
