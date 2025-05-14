**Polymorphism** is a core concept in object-oriented programming (OOP) that allows objects of different types to be treated as objects of a common super type. It literally means "many forms."

There are two main types of polymorphism:

---

### 1. **Compile-time Polymorphism (Static Polymorphism)**

- Achieved through **method overloading** or **operator overloading**.
- The decision about which method to call is made **at compile time**.

**Example (Method Overloading in Java):**

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

### 2. **Runtime Polymorphism (Dynamic Polymorphism)**

- Achieved through **method overriding**.
- The decision about which method to call is made **at runtime**, based on the object's actual type.

**Example (Method Overriding in Java):**

```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

Animal myPet = new Dog();
myPet.makeSound();  // Output: Bark
```

---

### In summary:

Polymorphism lets you write code that works on the **superclass type** but automatically adapts to the **actual subclass behavior** at runtime. This makes programs **more flexible and easier to extend**.
