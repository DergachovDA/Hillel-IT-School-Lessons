package homework.sorter;

public class Main {

    public static void main(String[] args) {

        int[] array = {9, 4, 3, 6, 8, 5, 0, 7, 2, 1};

        Sorter sorter = new Sorter("Insertion");
        sorter.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}