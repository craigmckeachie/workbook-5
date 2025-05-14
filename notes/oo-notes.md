# Object Oriented Notes

## Inheritance

- responsibilities (including attributes/fields and methods) are inherited from the parent to the child, but the child can have unique responsibilities to the parent
- parent and child classes
- Examples

  - like humans inherit stuff via genetics from their parents (habits, height, eye color, etc..)
  - Zoo:
    - Animals (parent/base/super class)
      - Dog (child/subclass)
      - Cat (child/subclass)
  - Pet:
    - Pet
      - Dog
      - Cat
      - Bird
        - Parakeet
  - Vehicles:
    - Vehicle
      - Car
      - Semitruck
      - Moped
      - Hovercraft
  - instanceof: allows us to check the data type of the class, so we can use it appropriately (don't make Grandma sprint)

    ### Constructors

    - if you don't declare any constructors
      - one will be created for you
      - it will be parameterless (nothing passed into the constructor method)
      - it will call `super()` for you
    - if you write your own constructor(s)
      - the generated default constructor is no longer there, you need to explicitly create the parameterless constructor if you want one
        - it will call `super()` for you
        - you should call `super()` in the first line before doing anything else
        - `super` can be called with any parameters (parameterless)
        - `super` can also call a parameterized constructor in the base class

## Polymorphism

Poly- many
morph- change form

You are holding

### Method Overriding

- You are defining a method in a base/parent class and then overriding it's implementation in the sub/child class.
- You're choosing the method in the subclass over a method of the same name in the superclass
  - the methods need to have a matching number and data type of parameters for the override to work

### Method Overloading

- Determines which method of the same name to use based on the number and type of parameters

---

### Examples: Constructor Chaining in Inheritance

When working with classes in Java, constructors play a key role in setting up objects. If one class **extends** another, constructors from both classes are involved. This is called **constructor chaining**. There are two main scenarios:

---

#### Case 1: Using the Generated Default Constructor

If you don't write any constructor in your subclass, Java will automatically generate one for you. This generated constructor will call the **no-argument constructor** of the parent class using `super()` behind the scenes.

```java
class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    // No constructor written here
    // Java generates this:
    // Dog() {
    //     super();
    // }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
```

**Output:**

```
Animal created
```

✅ **Use this when:**

- The parent class has a parameterless constructor.
- You don’t need any special setup in the child class.

---

#### Case 2: Explicit Constructor with `super()`

If your parent class defines a constructor that **requires arguments**, then your subclass must explicitly call it using `super(...)`—otherwise your code won't compile.

```java
class Animal {
    Animal(String name) {
        System.out.println("Animal named " + name + " created");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name); // Required because Animal doesn't have a no-arg constructor
        System.out.println("Cat named " + name + " created");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
    }
```

**Output:**

```
Animal named Whiskers created
Cat named Whiskers created
```

✅ **Use this when:**

- The parent class requires information to initialize.
- You want control over how the parent and child classes are both set up.

---



