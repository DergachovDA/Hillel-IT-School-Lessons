package homework;
//Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
// (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).

//Запуск в консоли:
//$ java -cp out/production/HomeWork/ ua.in.dergachovda.less03.CalculatorHomeArgs 3 - 2
//Результат: 1


public class CalculatorHomeArgs {
    public static void main(String[] args) {

        int result = 0;
        String operation = args[1];
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

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
