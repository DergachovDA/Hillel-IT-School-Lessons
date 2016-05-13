package collections.lists;

import java.util.Iterator;

public interface List {

    int size();

    boolean isEmply();

    boolean contains(String element);

    void add(String element);

    String set(int index, String element);

    void remove(int index);

    void remove(String element);

    void clear();

    int indexOf(String element);

    String get(int index);

    Iterator listIterator();

    Iterator backwardListIterator();

    Iterator randomIterator();

}
