public class WinChecker {

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

    // Check winning condition
    public static boolean checkWin(char[][] b, char s) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == s && b[i][1] == s && b[i][2] == s) ||
                (b[0][i] == s && b[1][i] == s && b[2][i] == s)) {
                return true;
            }
        }

        // Diagonals
        if ((b[0][0] == s && b[1][1] == s && b[2][2] == s) ||
            (b[0][2] == s && b[1][1] == s && b[2][0] == s)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Example board (simulate win)
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', '-', 'O'},
                {'-', '-', '-'}
        };

        printBoard(board);

        if (checkWin(board, 'X')) {
            System.out.println("\nPlayer X Wins! 🎉");
        } else {
            System.out.println("\nNo winner yet.");
        }
    }
}
