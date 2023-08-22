import java.util.Scanner;

public class Main {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        board = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

        return ;
    }

    public static void partition(int row, int col, int size) {
        if(colorCheck(row, col, size)) {
            if(board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int halfSize = size / 2;

        partition(row, col, halfSize);
        partition(row, col + halfSize, halfSize);
        partition(row + halfSize, col, halfSize);
        partition(row + halfSize, col + halfSize, halfSize);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
