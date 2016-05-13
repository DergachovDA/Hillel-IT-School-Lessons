package game;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("exit")) {

            System.out.println("Game started...");

            Player playerX = new Player("Ivanov", "Ivan", "Petrovich", 25, 'X');
            Player playerO = new Player("Petrov", "Petr", "Petrovich", 35, 'O');

            Board board = new Board(playerX, playerO);

            while (!board.gameFinished()) {
                System.out.println("Player " + board.getCurrentPlayer() + " move...");
                System.out.println("Enter your move: ");
                String move = scanner.next();
                if (!board.makeMove(move)) {
                    System.out.println("Input incorrect! Repeat your move.");
                } else {
                    System.out.println(board);
                }
            }

            System.out.println(board.getWinnerPlayer());
            System.out.println();

            Statistics statistics = new Statistics();
            GameResult resultPlayerA;
            GameResult resultPlayerB;
            if (board.calculateWinner() == null) {
                resultPlayerA = new GameResult(board.getCurrentPlayer(), "draw");
                resultPlayerB = new GameResult(board.getNextPlayer(), "draw");
            } else {
                resultPlayerA = new GameResult(board.calculateWinner(), "win");
                resultPlayerB = new GameResult(board.calculateLoser(), "lost");
            }
            statistics.addResult(resultPlayerA);
            statistics.addResult(resultPlayerB);

            System.out.println("Enter:\n" +
                                "\"exit\" to exit" +
                                "\"stat\" to show statistics");

            input = scanner.next();
            if (input.equals("stat")) {
                System.out.println(statistics);
            }

        }
    }

}