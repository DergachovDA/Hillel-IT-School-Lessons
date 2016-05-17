package zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Zoo zoo = new Zoo();
        Animal animal = zoo.makeAnimal(input);

        animal.voice();

    }

}
