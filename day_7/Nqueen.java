package day_7;

public class Nqueen {
    static int N = 8;
    static int[] board = new int[N];

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col) {
                return false;
            }
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;  
    }
    static boolean solve(int row) {
        if (row == N) {
            return true; 
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (solve(row + 1)) {
                    return true;
                }
                board[row] = -1; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            board[i] = -1;
        }
        if (solve(0)) {
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    if (board[row] == col)
                        System.out.print("Q ");
                    else
                        System.out.print(". ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}
