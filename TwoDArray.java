public class TwoDArray {
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        board[0][0] = "-";
        board[1][1] = "-";
        board[2][2] = "-";
        for (String[] line : board) {
            for (String item : line) {
                System.out.print(item + "      ");
            }
            System.out.println();
        }
    }
}
