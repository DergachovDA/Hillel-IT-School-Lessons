package homework.sorter.strategy;

import java.util.Arrays;

public class QuickSort implements SortStrategy{
    @Override
    public void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
    }

    private void quickSort(int[] array, int left, int right) {

        if (left >= right) return;

        int i = left;
        int j = right;
        int mid = i - (i - j) / 2;

        while (i < j) {

            while (i < mid && array[i] <= array[mid]) i++;
            
            while (j > mid && array[mid] <= array[j]) j--;

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == mid)
                    mid = j;
                else if (j == mid)
                    mid = i;
            }
        }

        quickSort(array, left, mid);
        quickSort(array, mid + 1, right);

    }
}
