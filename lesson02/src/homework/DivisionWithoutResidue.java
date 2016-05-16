package homework;

//Даны 2 числа, определить делится ли первое число на второе без остатка

public class DivisionWithoutResidue {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        boolean divWithoutResidue;

        divWithoutResidue = num1 % num2 == 0 ? true : false;

        if (divWithoutResidue)
            System.out.println(num1 + " divided by " + num2 + " without residue");
        else
            System.out.println(num1 + " divided by " + num2 + " with residue");

    }
}
