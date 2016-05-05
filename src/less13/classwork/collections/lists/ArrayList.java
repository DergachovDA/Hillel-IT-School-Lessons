package less13.classwork.collections.lists;

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

    }

    public void remove(String element) {

    }

    public void clear() {

    }

    public int indexOf(String element) {
        return 0;
    }

    public String get(int index) {
        return null;
    }
}
