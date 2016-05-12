package com.hillel.lists;

public class Dog extends Animal {

    String name;

    Dog() {
        this("Default Dog");
    }

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Dog");
    }

    public String toString() {
        return name;
    }

}
