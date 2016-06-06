package com.java.hillel.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(14);
        stack.push(13);
        stack.push(18);
        stack.push(3);
        stack.push(9);
        stack.push(19);
        stack.push(20);
        stack.push(100);

        System.out.println(stack);

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println(stack);
    }
}
