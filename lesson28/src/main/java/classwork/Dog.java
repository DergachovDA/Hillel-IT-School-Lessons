package classwork;

import java.io.Serializable;

public class Dog implements Serializable{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "homework.classwork.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
