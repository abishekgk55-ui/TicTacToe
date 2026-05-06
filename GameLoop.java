import java.util.Scanner;

public class GameLoop {

    // Print board
    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check valid move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Check win
    public static boolean checkWin(char[][] b, char s) {
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == s && b[i][1] == s && b[i][2] == s) ||
                (b[0][i] == s && b[1][i] == s && b[2][i] == s)) {
                return true;
            }
        }
        return (b[0][0] == s && b[1][1] == s && b[2][2] == s) ||
               (b[0][2] == s && b[1][1] == s && b[2][0] == s);
    }

    // Check draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '-')
                    return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;

        while (!gameOver) {

            printBoard(board);
            System.out.println("\nPlayer " + currentPlayer + "'s turn");

            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter col (0-2): ");
            int col = sc.nextInt();

            if (isValidMove(board, row, col)) {

                placeMove(board, row, col, currentPlayer);

                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins! 🎉");
                    gameOver = true;
                } else if (isDraw(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }
}
