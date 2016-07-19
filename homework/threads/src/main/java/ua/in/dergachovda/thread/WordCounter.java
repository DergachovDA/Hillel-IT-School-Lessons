package ua.in.dergachovda.thread;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Integer> words = new HashMap<String, Integer>();

    public Map<String, Integer> getWords() {
        return words;
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        try {
            wordCounter.wordsToMap(new FileReader("files" + File.separator + "input.txt"));
            wordCounter.writeMapToFile(new FileWriter("files" + File.separator + "output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeMapToFile(FileWriter file) {
        try (BufferedWriter writer = new BufferedWriter(file)) {
            for (String word : words.keySet()) {
                writer.write(word + " : " + words.get(word));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void wordsToMap(FileReader file) {
        char[] chars = {'.', ',', '!', '?', '(', ')', ';', '\''};
        String line;

        try (BufferedReader reader = new BufferedReader(file)) {
            while ((line = reader.readLine()) != null) {
                for (char ch : chars) {
                    line = line.replace(ch, ' ');
                }

                for (String word : line.split(" ")) {
                    if (word.length() < 3) {
                        continue;
                    }
                    addWordToMap(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addWordToMap(String word) {
        int count = 1;
        if (words.containsKey(word)) {
            count += words.get(word);
        }
        words.put(word, count);
    }
}
