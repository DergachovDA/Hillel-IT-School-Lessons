package game;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Game started...");

        Player playerX = new Player("Ivanov", "Ivan", "Petrovich", 25, 'X');
        Player playerO = new Player("Petrov", "Petr", "Petrovich", 25, 'O');

        Board board = new Board();



        while (!board.gameFinished()) {
            System.out.println("Player " + board.getCurrentPlayer() + " move...");
            System.out.println("Enter your move: ");
            String move = scanner.next();
            if (!board.makeMove(move))
                System.out.println("Input incorrect! Repeat your move.");
            board.printBoard();
        }

        System.out.println("The winner is " + board.getWinnerPlayer());
        System.out.println();

//        GameResult result = new GameResult(board.);

    }

}
