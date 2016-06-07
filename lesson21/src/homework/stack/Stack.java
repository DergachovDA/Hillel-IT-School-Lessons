package homework.stack;

public class Stack {

    private String[] array;
    private int pointer;
    private final static int MAX_SIZE = 10;

    public Stack() {
        this.array = new String[MAX_SIZE];
        pointer = -1;
    }

    public void push(String element) {
        pointer++;
        if (pointer == MAX_SIZE) {
            pointer--;
            throw new StackOverflowException("The stack is full");
        }
        array[pointer] = element;
    }

    public String pop() {
        if (pointer == -1) {
            throw new StackIsEmptyException("The stack is empty");
        }
        String out = array[pointer];
        pointer--;
        return out;
    }
}
