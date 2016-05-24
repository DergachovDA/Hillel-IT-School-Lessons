package com.hillel.lists;

public class Animal {

    String name;

    Animal() {
        this("Default");
    }

    Animal(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Animal");
    }

    public String toString() {
        return name;
    }

}
