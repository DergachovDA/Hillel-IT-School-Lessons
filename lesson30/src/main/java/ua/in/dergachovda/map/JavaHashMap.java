package ua.in.dergachovda.map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {

        Map<String, Integer> words = new HashMap<String, Integer>();
        words.put("1", 1);
        words.put("2", 2);
        words.put("3", 3);
        words.put("4", 4);
        words.put("5", 5);
        words.put("5", 7);

        for (String key : words.keySet()) {
            Integer value = words.get(key);
            System.out.println(key + " : " + value);
        }

    }
}
