package com.hillel.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal parrot = new Parrot();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(parrot);

        for (Animal animal : animals)
            System.out.println(animal);

        animals.forEach(System.out::println);

    }

}
