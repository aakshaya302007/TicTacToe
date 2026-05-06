package srm.com.java;

public class TictactoeUC5 {
   static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        System.out.println(isValidMove(1, 1));
    }

    
    static boolean isValidMove(int row, int col) {
        // Check if row and column are within bounds (0-2)
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }

    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

}
