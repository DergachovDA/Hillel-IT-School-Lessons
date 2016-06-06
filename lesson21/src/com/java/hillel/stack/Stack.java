package com.java.hillel.stack;


public class Stack {
    private int[] array;
    private int index;
    private final static int SIZE = 10;

    Stack() {
        array = new int[SIZE];
        index = -1;
    }

    public void push(int i) throws SteckIsFullException {
        if (index == 9) {
            throw new SteckIsFullException("The stack is full");
        }
        index++;
        array[index] = i;
    }

    public int pop() throws StackIsEmptyException {
        if (index < 0) {
            throw new StackIsEmptyException("The stack is empty");
        }
        int i = array[index];
        index--;
        return i;
    }

    public String toString() {
        String s = "___\n";
        for (int i = index; i > -1; i--)
            s += array[i] + "\n";
        s += "___";
            return s;
    }
}
