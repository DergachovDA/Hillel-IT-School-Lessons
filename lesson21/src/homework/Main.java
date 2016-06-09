package homework;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] b = {1, 2, 3, 5, 9, 10, 11, 13, 40};
//        int[] a = {0, 3, 9, 45, 90};

        int[] a = createRandomArray();
        int[] b = createRandomArray();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("My");
        int[] c = getCommonElements(a, b);
        System.out.println(Arrays.toString(c));

        System.out.println("Artem");
        System.out.println(Arrays.toString(getCommonElementsA(a, b)));

        System.out.println("Stas");
        System.out.println(Arrays.toString(getCommonElementsS(a, b)));
    }


    private static int[] createRandomArray() {
        Random random = new Random();

        int n = random.nextInt(20);
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(300);
            array[i] = i > 0 ? value + array[i - 1] : value;
        }

        return array;
    }

    private static int[] getCommonElements(int[] a, int[] b) {

        int[] c = new int[a.length];
        int index = 0;
        int counter = 0;
        if (a[0] > b[b.length - 1] || b[0] > a[a.length - 1]) {
            return new int[0];
        }
        int jLeft = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[b.length - 1]) break;
            for (int j = jLeft; j < b.length; j++) {

                if (b[j] > a[i]) break;
                counter++;
                if (a[i] == b[j]) {
                    c[index] = a[i];
                    index++;
                    jLeft = j;
                    break;
                }

            }
        }
        System.out.println("counter: " + counter);
        return Arrays.copyOf(c, index);
    }

    private static int[] getCommonElementsA(int[] a, int[] b) {
        int[] c = new int[a.length];
        int index = 0;
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                counter++;
                if (a[i] == (b[j])) {
                    c[index] = b[j];
                    index++;
                }

            }
        }

        System.out.println("counter: " + counter);
        return Arrays.copyOf(c, index);
    }

    private static int[] getCommonElementsS(int[] a, int[] b) {
        int index1 = 0, index2 = 0;
        int[] c = new int[a.length];
        int counter = 0;
        int index = 0;

        while (index1 < a.length & index2 < b.length) {
            counter++;
            if (a[index1] == b[index2]) {
                c[index] = a[index1];
                index++;
                index1++;
                index2++;
            } else {
                if (a[index1] < b[index2]) {
                    index1++;
                } else {
                    index2++;
                }
            }
        }

        System.out.println("counter: " + counter);
        return Arrays.copyOf(c, index);
    }
}
