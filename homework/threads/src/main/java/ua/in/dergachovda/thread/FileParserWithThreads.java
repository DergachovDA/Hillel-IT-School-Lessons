package ua.in.dergachovda.thread;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

        String file1 =  PATH + "input1.txt";
        String file2 =  PATH + "input2.txt";
        String file3 =  PATH + "input3.txt";
        String[] files = {file1, file2, file3};

        NewThread[] threads = new NewThread[3];

        for (int i = 0; i < 3; i++) {
            threads[i] = new NewThread(files[i], counter);
        }

        try {
            for (NewThread thread : threads) {
                thread.join();
            }
            counter.writeMapToFile(new FileWriter(PATH + "output.txt"));

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
