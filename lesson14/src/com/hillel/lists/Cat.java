package com.hillel.lists;

public class Cat extends Animal {

    String name;

    Cat() {
        this("Default Cat");
    }

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Cat");
    }

    public String toString() {
        return name;
    }

}
