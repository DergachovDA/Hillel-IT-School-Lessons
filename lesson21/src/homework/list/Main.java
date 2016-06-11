package homework.list;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(LinkedList.LOOP);

//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");

        boolean check = list.isLoopRabbitAndTortoise();
        System.out.println(check);

        /*
        Iterator it = list.linkedListIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        */
    }
}
