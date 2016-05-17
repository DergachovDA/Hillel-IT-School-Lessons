package zoo;

public class Dog extends Animal {

    Dog(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public void voice() {
        System.out.println("Bark!");
    }

    public boolean canFly() {
        return false;
    }

}
