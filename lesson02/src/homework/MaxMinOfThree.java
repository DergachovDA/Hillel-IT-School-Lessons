package homework;
//Найти среди 3х чисел максимальное и минимальное

public class MaxMinOfThree {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;

        System.out.println("Minimum of three numbers: " + minimum(num1, num2, num3));
        System.out.println("Maximum of three numbers: " + maximum(num1, num2, num3));
    }

    public static int minimum(int a, int b, int c) {
        int min;
        if (a < b & a < c)
            min = a;
        else if (b < c)
            min = b;
        else
            min = c;
        return min;
    }

    public static int maximum(int a, int b, int c) {
        int max;
        if (a > b & a > c)
            max = a;
        else if (b > c)
            max = b;
        else
            max = c;
        return max;
    }
}
