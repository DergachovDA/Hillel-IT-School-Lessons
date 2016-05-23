package com.java.hillel.strategy.array;

public class MainApplication {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        GetNumber getNumber = new GetNumber(new GetMin());

//        GetNumber getNumber = new GetNumber(new Strategy() {
//            @Override
//            public int getNumber(int[] array) {
//                return array[3];
//            }
//        });

        System.out.println(getNumber.getNumber(array));

    }

}
