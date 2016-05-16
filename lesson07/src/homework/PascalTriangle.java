package homework;

public class PascalTriangle {

    public static void main(String[] args) {

        int n = 6;
        int[][] t = new int[n][];

        for (int i = 0; i < t.length; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j < t[i].length; j++)
                t[i][j] = getNext(t, i, j);
        }
        printTriangle(t);
    }

    public static void printTriangle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int tab = array.length - 1; tab > i; tab--)
                System.out.print("\t");
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "\t\t");
            System.out.print("\n\n");
        }
    }

    public static int getNext(int[][] t, int i, int j) {
        int left, right, result;

        if (i == 0)
            result = 1;
        else {
            if (j == 0)
                left = 0;
            else
                left = t[i - 1][j - 1];

            if (j < t[i - 1].length)
                right = t[i - 1][j];
            else
                right = 0;

            result = left + right;
        }

        return result;
    }
}
