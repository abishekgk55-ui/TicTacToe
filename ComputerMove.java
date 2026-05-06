import java.util.Random;

public class ComputerMove {

    // Print board
    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Convert slot → row
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot → col
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        Random rand = new Random();
        int slot, row, col;

        printBoard(board);

        // Loop until valid move
        do {
            slot = rand.nextInt(9) + 1; // 1–9
            row = getRow(slot);
            col = getCol(slot);
        } while (!isValidMove(board, row, col));

        // Place computer move
        placeMove(board, row, col, 'O');

        System.out.println("\nComputer chose slot: " + slot);
        printBoard(board);
    }
}