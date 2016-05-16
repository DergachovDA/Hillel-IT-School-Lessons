package homework;

// Добавить к калькулятору возможность ввода операции и чисел из консоли.
// В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию,
// далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.

import java.util.Scanner;

public class CalculatorHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите операцию (+, -, * или /):");
        String operation = scanner.next();

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int result = 0;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Не верный ввод операции!");
        }

        System.out.println("Результат: " + result);
    }
}
