<<<<<<< HEAD
package homework.sorter;

public class Sorter {

    private String sortingMethod;

    public Sorter(String sortingMethod) {
        this.sortingMethod = sortingMethod;
    }

    public void sort(int[] array) {
        switch (sortingMethod) {
            case "Brute force":
                bruteForce(array);
                break;
            case "Selection":
                selectionSort(array);
                break;
            case "Insertion":
                insertingSort(array);
                break;
//            case "Merge":
//                mergeSort(array);
//                break;
//            case "Quick":
//                quickSort(array);
//                break;
        }
    }

//    private void quickSort(int[] array) {
//    }
//
//    private void mergeSort(int[] array) {
//    }

    private void insertingSort(int[] array) {

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

    private void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private void bruteForce(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

}
=======
package homework.sorter;

public class Sorter {

}
>>>>>>> 132445e410abcb9aa6088b7a14e926069cc8ff15
