package ua.in.dergachovda.serializable;

import java.io.Serializable;

public class Dog implements Serializable{
    private static final long serialVersionUID = 1L;

    String name;
    int age;
    Owner owner;

    public Dog(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ua.in.dergachovda.serializable.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
