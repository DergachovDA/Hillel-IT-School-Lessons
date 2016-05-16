package homework;


public class Algorithm {
    public static void main(String[] args) {

        int n = 8;
        int k = 0;
        int x = 0;
        for (int i = 1; i < n - 1; i++) {
            x = x + i;
            k = k + x;
        }
        System.out.println("n:" + n + " k:" + k);

    }

}