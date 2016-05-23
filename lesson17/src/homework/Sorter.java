package homework;

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
                selection(array);
                break;
            case "Insertion":
                inserting(array);
                break;
            case "Merge":
                merge(array);
                break;
            case "Quick":
                quick(array);
                break;
        }
    }

    private void quick(int[] array) {
    }

    private void merge(int[] array) {
    }

    private void inserting(int[] array) {
    }

    private void selection(int[] array) {
    }

    private void bruteForce(int[] array) {
    }

}
