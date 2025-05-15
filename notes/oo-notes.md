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
        - you should call `super()` in the first line before doing anything else
        - `super` can be called with any parameters (parameterless)
        - `super` can also call a parameterized constructor in the base class

## Polymorphism

Poly- many
morph- change form

Allows objects of different types to be treated as objects of a common super type. It literally means "many forms."

### Method Overriding

- You are defining a method in a base/parent class and then overriding it's implementation in the sub/child class.
- You're choosing the method in the subclass over a method of the same name in the superclass
  - the methods need to have a matching number and data type of parameters for the override to work

### Method Overloading

- Determines which method of the same name to call based on the number and data type of parameters

---
