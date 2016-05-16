package homework;

//Написать программу, которая проверит, является ли число четным или нечетным

public class OddOrEven {
    public static void main(String[] args) {
        int n = 4;
        if ( (n % 2) == 0 )
            System.out.println(n + " is an even number.");
        else
            System.out.println(n + " is an odd number.");
    }
}
