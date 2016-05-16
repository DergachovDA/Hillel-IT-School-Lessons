package homework;

//8. Найти все счастливые билеты от 100000 до 999999

public class HappyTicket {

    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            int iLeft = i / 1000;
            int iRight = i % 1000;
            if (sumOfNumerals(iLeft) == sumOfNumerals(iRight))
                System.out.println(i);
        }
    }

    public static int sumOfNumerals(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

}
