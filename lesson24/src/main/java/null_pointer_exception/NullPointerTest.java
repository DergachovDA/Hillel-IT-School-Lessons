package null_pointer_exception;

public class NullPointerTest {
    public static void main(String[] args) {
        User user = new User();
        ATM atm = new ATM(user);

        atm.showUser();
    }
}
