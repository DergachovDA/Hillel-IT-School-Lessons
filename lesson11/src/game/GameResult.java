package game;
import java.util.Date;

public class GameResult {

    private Player player;
    private String result;
    private Date date;

    public GameResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
    }
}