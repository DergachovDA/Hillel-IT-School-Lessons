package collections.lists;

import java.util.Iterator;

public class BackwardListIterator implements Iterator{

    int current;
    String[] array;
    int size;

    BackwardListIterator(String[] array, int size) {
        this.array = array;
        this.size = size;
        this.current = size - 1;
    }

    public boolean hasNext() {
        return current > -1;
    }

    public Object next() {
        String element = array[current];
        current--;
        return element;
    }
}
