package ua.in.dergachovda.serializable;

import java.io.Serializable;

public class Owner implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    transient private int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ua.in.dergachovda.serializable.Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
