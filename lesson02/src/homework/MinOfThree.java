package ua.in.dergachovda.less02;
//Найти минимальное из 3х чисел
public class MinOfThree {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 1;
        int num3 = 3;

        int min;

        if (num1 < num2 & num1 < num3)
            min = num1;
        else if (num2 < num3)
            min = num2;
        else
            min = num3;

        System.out.println("Minimum of three numbers: " + min);
    }


}
