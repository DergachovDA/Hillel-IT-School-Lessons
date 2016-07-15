package ua.in.dergachovda.map.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> wordMap = getMapFromText(new FileReader("files" + File.separator + "input.txt"));
        
        writeMapToFile(new FileWriter("files" + File.separator + "output.txt"), wordMap);

    }

    private static void writeMapToFile(FileWriter file, Map<String, Integer> map) throws IOException {
        BufferedWriter writer = new BufferedWriter(file);
        for (String word : map.keySet()) {
            String out = word + " : " + map.get(word);
//            System.out.println(out);
            writer.write(out);
            writer.newLine();
        }
        writer.close();
    }

    private static Map<String, Integer> getMapFromText(FileReader file) throws IOException {
        BufferedReader reader = new BufferedReader(file);

        char[] chars = {'.', ',', '!', '?', '(', ')', ';', '\''};
        String line;

        ArrayList<String> wordList = new ArrayList<String>();

        while ((line = reader.readLine()) != null) {
            for (char ch : chars) {
                line = line.replace(ch, ' ');
            }

            for (String word : line.split(" ")) {
                if (word.length() < 3) {
                    continue;
                }
                wordList.add(word);
            }
        }

        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        for (String word : wordList) {
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word) + 1;
                wordMap.put(word, count);
            } else {
                wordMap.put(word, 1);
            }
        }

        reader.close();

        return wordMap;
    }
}
