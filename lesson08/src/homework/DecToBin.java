package homework;
//4. Напишите перевод из 10ной системы счисления в 2ную с помощью рекурсии.

import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        toBin(n);
    }

    public static int toBin(int n) {
        if (n >= 2) toBin(n >> 1);
        int result = n % 2;
        System.out.print(result);
        return result;
    }

}
