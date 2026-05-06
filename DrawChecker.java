public class DrawChecker {

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

    // Check draw condition
    public static boolean isDraw(char[][] board) {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any empty cell exists → not draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        return true; // No empty cells → draw
    }

    public static void main(String[] args) {

        // Example board (full, no winner)
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        printBoard(board);

        if (isDraw(board)) {
            System.out.println("\nGame is a Draw!");
        } else {
            System.out.println("\nMoves still possible.");
        }
    }
}
