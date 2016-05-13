package collections.lists;

import java.util.Iterator;
import java.util.Random;

public class ArrayList implements List {

    private static final int INITIAL_CAPACITY = 10;

    private String[] array;

    private int size;

    ArrayList() {
        this(INITIAL_CAPACITY);
        //array = new String[INITIAL_CAPACITY];
    }

    ArrayList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmply() {
        return size == 0;
    }

    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element))
                return true;
        }
        return false;
    }

    public void add(String element) {
        resize();
        array[size] = element;
        size++;
    }

    private void resize() {
        //увеличиваем
        if (size == array.length) {
            newArray(size << 1);
        }

        //уменьшаем
        if (size < array.length / 4) {
            newArray(array.length >> 1);
        }
    }

    private void newArray(int size) {
        String[] arrayNew = new String[size];
        System.arraycopy(array, 0, arrayNew, 0, this.size);
        array = arrayNew;
    }

    public String set(int index, String element) {
        String oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        resize();
    }

    public void remove(String element) {

    }

    public void clear() {

    }

    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element))
                return i;
        }
        return -1;
    }

    public String get(int index) {
        return array[index];
    }

    public String toString() {
        String out = "[ ";
        for (int i = 0; i < size; i++) {
            out += array[i];
            if (i != size - 1)
                out += ", ";
        }
        out += " ]";
        return out;
    }

    public Iterator listIterator() {
        return new ListIterator();
    }

    public Iterator backwardListIterator() {
        return new BackwardListIterator();
    }

    public Iterator randomIterator() {
        return new RandomIterator();
    }

    private class ListIterator implements Iterator {

        private int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class BackwardListIterator implements Iterator {

        private int current = size - 1;

        public boolean hasNext() {
            return current > -1;
        }

        public Object next() {
            String element = array[current];
            current--;
            return element;
        }
    }

    private class RandomIterator implements Iterator {

        private int current;
        private int[] indexArray;

        RandomIterator() {
            current = size - 1;
            indexArray = new int[size];
            for (int i = 0; i < indexArray.length; i++) {
                indexArray[i] = i;
            }
        }

        public boolean hasNext() {
            return current > -1;
        }

        public Object next() {
            int index = getNextRandomIndex(current);
            String element = array[indexArray[index]];
            moveIndex(index);
            current--;
            return element;
        }

        private int getNextRandomIndex(int current) {
            if (current == 0) return 0;
            Random random = new Random();
            int nextRandomIndex = random.nextInt(current);
            return nextRandomIndex;
        }

        private void moveIndex(int index) {
            int temp = indexArray[current];
            indexArray[current] = indexArray[index];
            indexArray[index] = temp;
        }
// 1 5 6 4. 2 3
    }

}
