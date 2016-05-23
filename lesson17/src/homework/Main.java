package homework;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 8, 5, 0, 7, 2, 9};

        Sorter sorter = new Sorter("Brute force");
        sorter.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}