package game;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<GameResult>();

    public void addResult(GameResult result) {
        results.add(result);
    }

    public String toString() {
        String out = "";
        for (GameResult gameResult : results) {
            out += gameResult.toString() + '\n';
        }
        return out;
    }
}