package homework;

import java.util.Scanner;

/*
5. Найти сумму первых n элементов массива
6. Найти минимальный и максимальный элемент массива
7. Найти сумму всех четных и сумму всех нечетных элементов массива
10. Вывести первые 5 минимальных элементов массива
 */

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 2, 43, 14, 55, 16, 77, 8, 29, 19};
        printArray(array);
        System.out.println("Сумма первых n элементов массива:");
        int n;
        while (true) {
            System.out.println("n = ");
            n = scanner.nextInt();
            if (n > array.length)
                System.out.println("n больше, чем элементов в массиве\nпопробуйте ещё раз");
            else
                break;
        }
        System.out.println("Сумма = " + sum(array, n));
        System.out.println("Минимальный элемент массива: " + minimum(array));
        System.out.println("Максимальный элемент массива: " + maximum(array));
        System.out.println("Сумма всех четных элементов массива: " + sumEven(array));
        System.out.println("Сумма всех нечетных элементов массива: " + sumOdd(array));
        System.out.println("Первые 5 минимальных элементов массива: " + fiveMinOfArray(array));
    }

    public static int sum(int[] a, int n) {
        int result = 0;
        for (int i = 0; i < n; i++)
            result += a[i];
        return result;
    }

    public static int minimum(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            min = Math.min(min, a[i]);
        return min;
    }

    public static int maximum(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            max = Math.max(max, a[i]);
        return max;
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i % 2 == 0 ? i : 0;
        return sum;
    }

    public static int sumOdd(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i % 2 != 0 ? i : 0;
        return sum;
    }

    public static int[] sotr(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = a.length - 1; j > i; --j) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        return a;
    }

    public static String fiveMinOfArray(int[] a) {
        String s = "";
        int[] sortArray = sotr(a);
        for (int i = 0; i < 5; i++)
            s += sortArray[i] + " ";
        return s;
    }

    public static void printArray(int[] a) {
        System.out.print("Массив: { ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("}");
    }

}
