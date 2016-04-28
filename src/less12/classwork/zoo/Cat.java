package less12.classwork.zoo;

public class Cat extends Animal {

    Cat() {
        name = "Tom";
        age = 5;
        weight = 5;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public boolean canFly() {
        return false;
    }

}
