package com.pluralsight;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();


        Pet pet1 = new Dog();
        Pet pet2 = new Cat();
        Pet pet3 = new Bird();
        Pet pet4 = new Parakeet();


        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);


        for (Pet pet: pets){
            pet.speak();

            if(pet instanceof Bird bird){
//                Bird bird = (Bird) pet;
                bird.fly();
            }
        }



    }
}
