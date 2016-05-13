package game;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<GameResult>();

    public void addResult(GameResult result) {
        results.add(result);
    }
}