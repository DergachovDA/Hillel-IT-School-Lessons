package homework;

//  2.  i18n используется для обозначения слова internationalization,
//  где 18 означает количество букв между первой и последней в этом слове,
//  такое можно встретить в среде разработчиков.
//  Например, для слова localization используется сокращение l10n.
//      Напишите функцию,
//  которая преобразует слова введенные из консоли через пробел в сокращенную форму.
//  Слова длиной меньше 4х оставить без изменений.
//      Пример ввода:
//        internationalization localization cat elephant monitor
//        Результат:
//        i18n l10n cat e6t m5r
//  PS: напишите функцию, которая сокращает слово,
//  в основной функции используйте метод сплит,
//  который поместит слова в массив и для каждого из них вызовет вашу функцию

import java.util.Scanner;

public class Cut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        String[] array_in = in.split(" ");
        String out = "";

        for (String s : array_in)
            out += cut(s) + " ";

        System.out.println(out.trim());
    }

    public static String cut(String s) {
        if (s.length() < 4) return s;
        return s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1);
    }

}
