package zoo;

public class Cat extends Animal {

    Cat(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public boolean canFly() {
        return false;
    }

}
