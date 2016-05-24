package homework.sorter.strategy;

public class InsertionSort implements SortStrategy{
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
