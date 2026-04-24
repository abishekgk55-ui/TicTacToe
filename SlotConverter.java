import java.util.Scanner;

public class SlotConverter {

    // Convert slot to row
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        // Optional validation (VERY GOOD FOR MARKS 👀)
        while (slot < 1 || slot > 9) {
            System.out.print("Invalid! Enter slot (1-9): ");
            slot = scanner.nextInt();
        }

        int row = getRow(slot);
        int col = getCol(slot);

        System.out.println("You selected slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}
