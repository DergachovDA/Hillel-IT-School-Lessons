package homework;
//Сделал в классе

import java.util.Scanner;

public class CalculatorInTheClassroom {

    public static void main(String[] args) {
        int a = 0, b = 0, result = 0;
        String operation;
        Scanner scanner  = new Scanner(System.in);

        System.out.println("a =");
        a = scanner.nextInt();

        System.out.println("operation");
        operation = scanner.next();

        System.out.println("b =");
        b = scanner.nextInt();

        switch (operation) {
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            default:
                System.out.println("error");
        }

        System.out.println("Result: " + result);


    }
}
