import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Dog dog = new Dog("Phluffy", 3);
//        serializeDog(dog);
        Dog dog = desrrializaDog();
        System.out.println(dog);
    }

    private static void serializeDog(Dog dog) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("e:\\inout\\dog.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)){

            outputStream.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Dog desrrializaDog() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("e:\\inout\\dog.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Dog dog = (Dog) inputStream.readObject();
        return dog;
    }
}
