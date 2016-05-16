package homework;
//9. Перевести число в двоичную систему счисления

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println(bin);
    }
}
