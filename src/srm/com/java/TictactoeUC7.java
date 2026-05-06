package srm.com.java;

import java.util.Random;

public class TictactoeUC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random random = new Random();
        int row, col;
        boolean validMove = false;
        
        while (!validMove) {
            row = random.nextInt(3);
            col = random.nextInt(3);
            
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                validMove = true;
            }
        }
    }
}