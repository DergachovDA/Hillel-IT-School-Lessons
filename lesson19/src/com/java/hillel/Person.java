package com.java.hillel;

public class Person {
//композиция
    private Heart heart = new Heart();

    public Person() {
        System.out.println("Person has been created");
    }
}
