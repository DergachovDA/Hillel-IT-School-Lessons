package com.java.hillel.linked;

public class CustomLinkedList {

    private Node first;
    private Node last;

    private class Node {
        String value;
        Node next;
    }

    public void add(String value) {
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

    public String poll() {
        String out = first.value;
        first = first.next;
        return out;
    }

    public String peek() {
        return first.value;
    }
}
