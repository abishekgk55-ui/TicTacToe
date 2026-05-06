import java.util.Scanner;

public class MovePlacer {

    // Method to place move (UC6)
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to print board
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

        // Initialize empty board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X'; // example

        printBoard(board);

        // Take input
        System.out.println("\nPlayer " + currentPlayer + "'s turn");

        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = scanner.nextInt();

        // Direct placement (UC6 focus)
        placeMove(board, row, col, currentPlayer);

        System.out.println("Move placed successfully ✅");

        printBoard(board);
    }
}