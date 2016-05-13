package game;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<>();

    public void addResult(GameResult result) {
        results.add(result);
    }

}
