package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        String input = "";

        System.out.println("Enter the \"start\" to start a new game:");

        while (true) {

            input = scanner.next();

            switch (input) {

                case "stat":
                    System.out.println("All results:");
                    System.out.println(statistics);

                    System.out.println("All winers:");
                    System.out.println(statistics.getAllWins());

                    System.out.println("All losses:");
                    System.out.println(statistics.getAllLosses());

                    System.out.println("All results for the year:");
                    System.out.println(statistics.getForYear());

                    System.out.println("All results for the month:");
                    System.out.println(statistics.getForMonth());

                    System.out.println("All results for the day:");
                    System.out.println(statistics.getForDay());
                    break;

                case "exit":
                    System.exit(0);
                    break;

                case "start":
                    System.out.println("Game started...");

                    Player playerX = new Human("Ivanov", "Ivan", "Petrovich", 25, 'X');
                    Player playerO = new Ai("Petrov", "Petr", "Petrovich", 35, 'O');

                    Board board = new Board(playerX, playerO);

                    while (!board.gameFinished()) {
                        System.out.println("Player " + board.getCurrentPlayer() + " move...");
                        System.out.println("Enter your move: ");
                        //String move = scanner.next();
                        if (!board.makeMove()) {
                            System.out.println("Input incorrect! Repeat your move.");
                        } else {
                            System.out.println(board);
                        }
                    }

                    System.out.println(board.getWinnerPlayer());
                    System.out.println();

                    if (board.calculateWinner() == null) {
                        statistics.addResult(new GameResult(board.getCurrentPlayer(), GameResult.DRAW));
                        statistics.addResult(new GameResult(board.getNextPlayer(), GameResult.DRAW));
                    } else {
                        statistics.addResult(new GameResult(board.calculateWinner(), GameResult.WIN));
                        statistics.addResult(new GameResult(board.calculateLoser(), GameResult.LOSS));
                    }
                break;
            }
            System.out.println("Enter the \"start\" to start a new game");
            System.out.println("or enter the \"stat\" to show statistics");
            System.out.println("or enter the \"exit\" to exit the application.");
        }
    }

}