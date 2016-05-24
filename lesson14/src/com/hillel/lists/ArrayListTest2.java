package com.hillel.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest2 {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal parrot = new Parrot();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(parrot);
//        animals.add(new Random());

        Animal animal = animals.get(0);
        animal.voice();

        Animal animal1 = animals.get(2);
        animal1.voice();
    }

}
