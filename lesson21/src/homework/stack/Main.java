package homework.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        String[] array = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};

        for (String s : array) {
            stack.push(s);
        }

        String s = stack.pop();

        System.out.println(stack.pop());

    }
}
