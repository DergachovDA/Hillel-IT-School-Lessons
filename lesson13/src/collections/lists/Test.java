package collections.lists;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);

        Iterator it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        System.out.println();

        Iterator backIt = list.backwardListIterator();
        while (backIt.hasNext()) {
            System.out.println("Element: " + backIt.next());
        }

        System.out.println();

        Iterator randIt = list.randomIterator();
        while (randIt.hasNext()) {
            System.out.println("Element: " + randIt.next());
        }

    }

}
