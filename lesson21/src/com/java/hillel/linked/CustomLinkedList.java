package com.java.hillel.linked;

public class CustomLinkedList<E> {

    private Node first;
    private Node last;

    private class Node {
        E value;
        Node next;
    }

    public void add(E value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public E poll() {
        E out = first.value;
        first = first.next;
        return out;
    }

    public E peek() {
        return first.value;
    }
}
