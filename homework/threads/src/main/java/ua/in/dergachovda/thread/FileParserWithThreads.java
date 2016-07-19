package ua.in.dergachovda.thread;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class NewThread extends Thread {
    String file;
    WordCounter counter;

    NewThread(String file, WordCounter counter) {
        this.file = file;
        this.counter = counter;
        this.start();
    }

    @Override
    public void run() {
        try {
            counter.wordsToMap(new FileReader(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class FileParserWithThreads {

    private static final String PATH = "files" + File.separator;

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        readFromFiles(counter, "input1.txt", "input2.txt", "input3.txt");

        try {
            counter.writeMapToFile(new FileWriter(PATH + "output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFiles(WordCounter counter, String... files) {
        ArrayList<NewThread> threads = new ArrayList<>();

        for (int i = 0; i < files.length; i++) {
            threads.add(new NewThread(PATH + files[i], counter));
        }

        for (NewThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
