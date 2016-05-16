package homework;

public class SortArray {

    public static void main(String[] args) {
        int[] sortArray = {3, 5, 1, 7, 2, 4, 6, 8, 9, 0};
        Utils.printArray(sort(sortArray));

        System.out.println();

        int[] selectionSortArray = {3, 5, 1, 7, 2, 4, 6, 8, 9, 0};
        Utils.printArray(selectionSort(selectionSortArray));
    }

    public static int[] sort(int[] a) {
        int operation = 0;
        long start = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    operation++;
                }
            }
        }

        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Sort duration is: " + duration + " ns");
        System.out.println("Operation is " + operation);

        return a;
    }

    public static int[] selectionSort(int[] a) {
        int operation = 0;
        long start = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[indexMin])
                    indexMin = j;
            if (i != indexMin) {
                int temp = a[i];
                a[i] = a[indexMin];
                a[indexMin] = temp;
                operation++;
            }
        }

        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Selection sort duration is: " + duration + " ns");
        System.out.println("Operation is " + operation);

        return a;
    }
}
