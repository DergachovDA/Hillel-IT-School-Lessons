package ua.in.dergachovda.races;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList<>());
    //=
        SynchronizedCounter counter = new SynchronizedCounter(new Counter());
    }
}
