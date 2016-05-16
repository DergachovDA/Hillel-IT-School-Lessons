package homework;

//Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

public class CloserToTen {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;

        if (distanceToTen(num1) == distanceToTen(num2))
            System.out.println(num1 + " and " + num2 + " are equidistant from 10");
        else if (distanceToTen(num1) < distanceToTen(num2))
            System.out.println(num1 + " closer to 10");
        else
            System.out.println(num2 + " closer to 10");
    }

    public static int distanceToTen(int a) {
        int result = 10 - a;
        return result < 0 ? -result : result;
    }


}
