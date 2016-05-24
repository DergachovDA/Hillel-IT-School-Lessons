package com.hillel.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Parrot> parrotList = new ArrayList<>();
        parrotList.add(new Parrot("First"));
        parrotList.add(new Parrot("Second"));
        parrotList.add(new Parrot("Third"));

        for (Parrot parrot : parrotList) {
            System.out.println(parrot);
        }


    }

}
