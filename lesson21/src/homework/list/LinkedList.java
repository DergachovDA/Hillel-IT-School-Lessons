package homework.list;

import java.util.Iterator;

public class LinkedList<E> {

    private Node first;
    private Node last;
    public final static boolean LOOP = true;

    public LinkedList() {
    }

    public LinkedList(boolean loop) {
        if (loop) {
            Node node0 = new Node();
            Node node1 = new Node();
            Node node2 = new Node();
            Node node3 = new Node();

            first = node0;

            node0.previous = null;
            node0.value = (E) "a";
            node0.next = node1;

            node1.previous = node0;
            node1.value = (E) "b";
            node1.next = node2;

            node2.previous = node1;
            node2.value = (E) "c";
            node2.next = node3;

            node3.previous = node2;
            node3.value = (E) "d";
            node3.next = node1;

            last = null;
        }
    }

    private class Node {
        Node previous;
        E value;
        Node next;
    }

    public boolean isLoop() {
        Node n = this.first;

        while (n != null) {
            if (n.next == n.next.previous) {
                n = n.next;
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean isLoopRabbitAndTortoise() {
        if (this.first == null) {
            return false;
        }

        Node tortoise = first;
        Node rabbit = first.next;

        while (rabbit != tortoise && rabbit.next != tortoise) {
            if (rabbit == null || rabbit.next == null) {
                return false;
            }
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }

        return true;
    }

    public void add(E value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if (first == null) {
            node.previous = null;
            first = last = node;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
        }
    }

    public E pool() {
        E out = first.value;
        first = first.next;
        return out;
    }

    public E peek() {
        return first.value;
    }

    public Iterator linkedListIterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {
        private Node node = first;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Object next() {
            E element = node.value;
            node = node.next;
            return element;
        }
    }


}
