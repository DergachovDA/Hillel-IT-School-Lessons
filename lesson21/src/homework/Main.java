package homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 5, 9, 10, 11, 13, 40};
        int[] a = {0, 3, 9, 45, 90};

        int[] c = getCommonElements(a, b);

        System.out.println(Arrays.toString(c));
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
//        System.out.println(counter);
        return Arrays.copyOf(c, index);
    }
}
