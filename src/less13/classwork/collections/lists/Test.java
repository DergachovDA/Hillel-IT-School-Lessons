package less13.classwork.collections.lists;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");

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

    }

}
