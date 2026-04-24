import java.util.Scanner;

public class MoveValidator {

    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X'; // Start with X

        printBoard(board);

        // Take input
        System.out.println("\nPlayer " + currentPlayer + "'s turn");

        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = scanner.nextInt();

        // Validate
        if (isValidMove(board, row, col)) {
            board[row][col] = currentPlayer;
            System.out.println("Move accepted ✅");
        } else {
            System.out.println("Invalid move ❌");
        }

        printBoard(board);
    }
}