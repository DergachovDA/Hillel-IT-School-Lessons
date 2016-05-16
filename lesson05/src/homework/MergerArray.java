package ua.in.dergachovda.less05;

import ua.in.dergachovda.Utils;

public class MergerArray {

    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        Utils.printArray(mergerArray(a, b));

    }

//    public static int[] mergerArray (int[] a, int[] b) {
//        int[] resultArray = new int[a.length + b.length];
//        for (int i = 0; i < resultArray.length; i++)
//            resultArray[i] = i < a.length ? a[i] : b[i - a.length];
//        return Utils.arraySort(resultArray);
//    }

    public static int[] mergerArray(int[] a, int[] b) {
        int[] resultArray = new int[a.length + b.length];
        int index_a = 0;
        int index_b = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (index_a < a.length && index_b < b.length) {
                if (a[index_a] < b[index_b]) {
                    resultArray[i] = a[index_a];
                    index_a++;
                } else {
                    resultArray[i] = b[index_b];
                    index_b++;
                }
            } else {
                if (index_a < a.length) {
                    resultArray[i] = a[index_a];
                    index_a++;
                }
                if (index_b < b.length) {
                    resultArray[i] = b[index_b];
                    index_b++;
                }
            }
        }
        return resultArray;
    }

}
