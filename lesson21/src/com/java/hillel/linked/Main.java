package com.java.hillel.linked;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.peek());

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
    }
}
