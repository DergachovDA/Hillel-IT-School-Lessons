package game;

import java.util.Random;

public class Ai extends Player{

    public Ai(String lastname, String firstname, String middlename, int age, char type) {
        super(lastname, firstname, middlename, age, type);
    }

    @Override
    public String makeMove() {
        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);
        return String.valueOf(x) + String.valueOf(y);
    }


}
