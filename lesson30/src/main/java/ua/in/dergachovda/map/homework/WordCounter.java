package ua.in.dergachovda.map.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {

        try {

            Map<String, Integer> words = getMapFromText(new FileReader("files" + File.separator + "input.txt"));

            writeMapToFile(new FileWriter("files" + File.separator + "output.txt"), words);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeMapToFile(FileWriter file, Map<String, Integer> map) {

        try (BufferedWriter writer = new BufferedWriter(file)) {
            for (String word : map.keySet()) {
                writer.write(word + " : " + map.get(word));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> getMapFromText(FileReader file) {

        char[] chars = {'.', ',', '!', '?', '(', ')', ';', '\''};
        String line;
        Map<String, Integer> words = new HashMap<String, Integer>();

        try (BufferedReader reader = new BufferedReader(file)) {
            while ((line = reader.readLine()) != null) {
                for (char ch : chars) {
                    line = line.replace(ch, ' ');
                }

                for (String word : line.split(" ")) {
                    if (word.length() < 3) {
                        continue;
                    }

                    int count = 1;
                    if (words.containsKey(word)) {
                        count += words.get(word);
                    }

                    words.put(word, count);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }
}
