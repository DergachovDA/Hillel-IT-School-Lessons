package zoo;
//Pattorn Factory
public class Zoo {

    public Animal makeAnimal(String type) {
        Animal animal = null;
        switch (type) {
            case "cat":
                animal = new Cat("Tom", 1, 3);
                break;
            case "dog":
                animal = new Dog("Pluto", 3, 7);
                break;
            case "parrot":
                animal = new Parrot("Kesha", 5, 1);
                break;
            default:
                animal = null;
        }
        return animal;
    }

}
