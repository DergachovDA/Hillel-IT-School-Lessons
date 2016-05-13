package calculator;

public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        BaseCalculator[] calculators =
                {       new Adder(a, b),
                        new Subtracter(a, b),
                        new Multiplier(a, b),
                        new Divider(a, b)       };

        for (BaseCalculator calc : calculators) {
            System.out.println(calc.toString() + calc.calculate());
        }

    }
}