package homework;

//  3.  Определить является ли слово палиндромом,
//  т.е. читается одинаково, слева направо и справа налево.
//  Определить количество таких слов в тексте, в котором все слова введены через запятую.
//
//        Пример ввода:
//        deleveled, evitative, cat, dog, deified
//        Результат:
//        There are 3 palindromes in the text
//
//  PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String in = scanner.nextLine();

        String[] array_in = in.split(",");
        for (int i = 0; i < array_in.length; i++) {
            array_in[i] = array_in[i].trim();
            if (palindrome(array_in[i])) n++;
        }
        System.out.println("There are " + n + " palindromes in the text");
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i <= s.length() >> 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

}
