package homework.sorter.strategy;

public class MergeSort implements SortStrategy{
    @Override
    public void sort(int[] array) {
        array = marageSort(array);
    }

    private int[] marageSort(int[] array) {

        if (array.length < 2)
            return array;

        int[] left = new int[array.length >> 1];
        int[] right = new int[array.length - left.length];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        marageSort(left);
        marageSort(right);

        merge(left, right, array);

        return array;
    }

    void merge(int[] left, int[] right, int[] array) {
        int indexL = 0;
        int indexR = 0;

        for (int i = 0; i < array.length; i++) {

            if (indexL >= left.length) {
                array[i] = right[indexR];
                indexR++;
                continue;
            }

            if (indexR >= right.length) {
                array[i] = left[indexL];
                indexL++;
                continue;
            }

            if (left[indexL] < right[indexR]) {
                array[i] = left[indexL];
                indexL++;
            } else {
                array[i] = right[indexR];
                indexR++;
            }
        }

    }
}
