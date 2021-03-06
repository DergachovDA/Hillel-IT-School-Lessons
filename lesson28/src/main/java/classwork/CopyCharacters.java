package classwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("e:\\inout\\in2.txt");
            fileWriter = new FileWriter("e:\\inout\\out2.txt");

            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
                fileWriter.write(ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush(); //save file
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
