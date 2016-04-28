package less12.classwork.zoo;

import less12.classwork.zoo.Animal;

public class Dog extends Animal {

    Dog() {
        name = "Pluto";
        age = 3;
        weight = 10;
    }

    public void voice() {
        System.out.println("Bark!");
    }

    public boolean canFly() {
        return false;
    }

}
