package homework;

/*
1. Создайте программу,
выводящую на экран все четырёхзначные числа последовательности
1000 1003 1006 1009 1012 1015 ….

2. Создайте программу,
выводящую на экран первые 55 элементов последовательности
1 3 5 7 9 11 13 15 17 ….

3. Создайте программу,
выводящую на экран все неотрицательные элементы последовательности
90 85 80 75 70 65 60 ….

4. Создайте программу,
выводящую на экран первые 20 элементов последовательности
2 4 8 16 32 64 128 ….
 */
public class Sequence {

    public static void main(String[] args) {
        System.out.println("1. Все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 …:");
        System.out.println(fourDigitNumber(1000, 3));

        System.out.println("\n2. Первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …:");
        System.out.println(firstFiftyFive(1, 2));

        System.out.println("\n3. Все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …:");
        System.out.println(nonNegative(90, 5));

        System.out.println("\n4. Первые 20 элементов последовательности 2 4 8 16 32 64 128 …:");
        System.out.println(firstTwenty(2, 2));
    }

    public static String fourDigitNumber(int n, int step) {
        String result = "";
        while (n / 10000 == 0) {
            result += n + " ";
            n += step;
        }
        return result;
    }

    public static String firstFiftyFive(int n, int step) {
        String result = "";
        for (int i = 0; i < 55; i++) {
            result += n + " ";
            n += step;
        }
        return result;
    }

    public static String nonNegative(int n, int step) {
        String result = "";
        while (n >= 0) {
            result += n + " ";
            n -= step;
        }
        return result;
    }

    public static String firstTwenty(int n, int step) {
        String result = "";
        for (int i = 0; i < 20; i++) {
            result += n + " ";
            n *= step;
        }
        return result;
    }

}
