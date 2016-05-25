package homework.sorter.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 6, 8, 5, 0, 7, 2, 1};

        Sorter sorter = new Sorter(new QuickSort());
        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
