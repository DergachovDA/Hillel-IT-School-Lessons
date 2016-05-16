package homework;

//Найти минимальное из 3х чисел,
//причем, если минимальных несколько вывести все такие числа
public class MinOfThree2 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 1;
        int num3 = 1;

        int min;

        if (num1 < num2 & num1 < num3)
            min = num1;
        else if (num2 < num3)
            min = num2;
        else
            min = num3;

        String s = "Minimum of three numbers:";

        if (num1 == min) s +=" " + num1;
        if (num2 == min) s +=" " + num2;
        if (num3 == min) s +=" " + num3;

        System.out.println(s);
    }
}
