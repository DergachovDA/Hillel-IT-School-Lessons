package zoo;

public class Parrot extends Animal {

    Parrot(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public void voice() {
        System.out.println("Parrot!");
    }

    public boolean canFly() {
        return true;
    }

}
