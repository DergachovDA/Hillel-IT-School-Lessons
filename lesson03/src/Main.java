import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0;

//        Scanner scanner = new Scanner(System.in);
//
//        a = scanner.nextInt();
//        b = scanner.nextInt();

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Sum of the numbers is  " + (a + b));

    }
}
