//黑白棋游戏
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int Size = 3;
        int[][] board = new int[Size][Size];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;
        int numOfX1 = 0;
        int numOfO1 = 0;
        //读入矩阵
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        //检查行列
        for(int i = 0;i < board.length; i++) {
            numOfX = 0;
            numOfO = 0;
            for(int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    numOfX++;
                } else {
                    numOfO++;
                }
                if (board[j][i] == 1) {
                    numOfX1++;
                } else {
                    numOfO1++;
                }
            }
            if(numOfO == Size || numOfO1 == Size || numOfX == Size || numOfX1 == Size) {
                gotResult = true;
                break;
            }
        }
        //检查对角线
        if(!gotResult) {
            numOfO = 0;
            numOfX = 0;
            for(int i = 0; i < board.length; i++) {
                if(board[i][i] ==1) {
                    numOfX++;
                } else {
                    numOfO++;
                }
                if(numOfO == Size || numOfX == Size) {
                    gotResult = true;
                    break;
                }
            }
        }
        //检查反对角线
        if(!gotResult) {
            numOfX = 0;
            numOfO = 0;
            for(int i = 0; i < board.length; i++) {
                if(board[i][Size-i-1] == 1) {
                    numOfX++;
                } else {
                    numOfO++;
                }
                if(numOfO == Size || numOfX == Size) {
                    gotResult = true;
                    break;
                }
            }
        }
        if(gotResult) {
            if(numOfX == Size || numOfX1 == Size) {
                System.out.println("Winner is X!");
            } else {
                System.out.println("Winner is O!");
            }
        }
    }
}
