package com.pluralsight;

public class Program {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Yuki");
        System.out.println(animal.getName());
//        animal.bark(); doesn't work
//        animal.meow(); doesn't work
//
        Dog dog = new Dog("Leo", "tan", "Cavipoo");
        dog.setName("Leo");
        System.out.println(dog.getName());
//        dog.bark();

        Cat cat = new Cat();
        cat.setName("P Kitty");
        System.out.println(cat.getName());
//        cat.meow();



    }
}
