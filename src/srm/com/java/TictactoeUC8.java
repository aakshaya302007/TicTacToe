package srm.com.java;

public class TictactoeUC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    public static void main(String[] args) {
        while (!gameOver) {
            if (isHumanTurn) {
                isHumanTurn = false;
            } else {
                isHumanTurn = true;
            }
                gameOver = true;
        }
    }
}
