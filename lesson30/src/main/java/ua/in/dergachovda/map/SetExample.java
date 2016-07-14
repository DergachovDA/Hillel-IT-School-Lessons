package ua.in.dergachovda.map;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("first");
        set.add("first");

        for (String elements : set) {
            System.out.println(elements);
        }
    }
}
