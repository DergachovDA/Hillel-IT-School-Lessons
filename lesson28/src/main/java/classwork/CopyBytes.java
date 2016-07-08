package classwork;

import java.io.*;

public class CopyBytes {

    public static void main(String[] args) {
        File inputFile = new File("e:\\inout\\in.txt");
        File outputFile = new File("e:\\inout\\out.txt");

        byte[] result = readFromFile(inputFile);

        writeToFile(outputFile, result);
    }

    private static void writeToFile(File file, byte[] arr) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            for (byte out : arr) {
                outputStream.write(out);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(File file) {
        byte[] arr = null;

        try (FileInputStream inputStream = new FileInputStream(file)){

            arr = new byte[(int)file.length()];
            int value;
            int index = 0;

            while ((value = inputStream.read()) != -1) {
                System.out.println(value);
                arr[index++] = (byte) value;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
}
