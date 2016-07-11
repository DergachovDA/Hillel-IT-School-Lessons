package ua.in.dergachovda.serializable;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ua.in.dergachovda.serializable.Dog dog = new ua.in.dergachovda.serializable.Dog("Phluffy", 3, new ua.in.dergachovda.serializable.Owner("Tom", 24));
//        serializeDog(dog);
        Dog dog = deserializeDog();
        System.out.println(dog);
    }

    private static void serializeDog(Dog dog) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("files" + File.separator + "dog.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)){
            outputStream.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Dog deserializeDog() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("files" + File.separator + "dog.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Dog dog = (Dog) inputStream.readObject();
        return dog;
    }
}
