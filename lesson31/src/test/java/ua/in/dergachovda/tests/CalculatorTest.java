package ua.in.dergachovda.tests;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        calculator = new Calculator();
    }

    @Test
    public void validateTwoNumbersAddition() {
        int result = calculator.add(3, 5);
        int expected = 8;

        assertEquals("Function of addition of two numbers returned wrong result", expected, result);
        System.out.println("Add");
    }

    @Test
    public void validateTwoNumbersSubtraction() {
        int result = calculator.subtract(4, 2);
        int expected = 2;

        assertEquals("Function of subtraction of two numbers returned wrong result", expected, result);
        System.out.println("Subtract");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Test(expected = DivisionByZero.class)
//    @Ignore
    public void shouldThrowDivideByZeroException() throws DivisionByZero{
        int result = calculator.divide(5, 0);
    }

//    @Test(timeout = 10)
//    public void testTimeout() {
//        for (int i = 0; i < 1000000; i++) {
//            int k = i / 10 + 10;
//        }
//    }
}
