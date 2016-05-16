package homework;

// Задача "Чаевые".
//   входные данные: сумма, которую вы должны заплатить и уровень сервиса
//   в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
//   - terrible (0%)
//   - poor (5%)
//   - good (10%)
//   - great (15%)
//   - excellent (20%)

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму чека:");
        double price = scanner.nextInt();

        System.out.println("Введите уровень сервиса:");
        String service = scanner.next();

        switch (service) {
            case "terrible":
                break;
            case "poor":
                price += price / 100 * 5;
                break;
            case "good":
                price += price / 100 * 10;
                break;
            case "great":
                price += price / 100 * 15;
                break;
            case "excellent":
                price += price / 100 * 20;
                break;
            default:
                System.out.println("Недопустимое значение");
        }

        System.out.println("Сумма чека с чаевыми: " + price);
    }
}
