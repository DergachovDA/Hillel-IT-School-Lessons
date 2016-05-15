package game;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GameResult {

    public static final String WIN = "win";
    public static final String LOSS = "loss";
    public static final String DRAW = "draw";

    private Player player;
    private String result;
    private Date date;

    public GameResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
    }

    public String getResult() {
        return this.result;
    }

    public Date getDate() {
        return this.date;
    }

    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        return player + "\t| " + result + "\t| " + dateFormat.format(date);
    }


}