package com.hillel.lists;

public class Parrot extends Animal {

    String name;

    Parrot() {
        this("Default Parrot");
    }

    Parrot(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Parrot");
    }

    public String toString() {
        return name;
    }

}
