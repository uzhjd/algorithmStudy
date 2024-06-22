import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int radius = Integer.parseInt(st.nextToken());

            int[][] board = new int[n][n];

            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for(int j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if(radius < 0) radius += 360;
            board = rotate(n, board, radius / 45);

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    sb.append(board[i][j] + " ");
                }
                sb.append("\n");
            }

            System.out.print(sb);
        }
    }

    static int[][] rotate(int n, int[][] board, int cnt) {

        for(int test = 0; test < cnt; test++) {
            int[] backup = new int[n];
            for (int i = 0; i < n; i++)backup[i] = board[i][i];

            for (int i = 0; i < n; i++) board[i][i] = board[n/2][i];
            for (int i = 0; i < n; i++) board[n/2][i] = board[n-i-1][i];
            for (int i = 0; i < n; i++) board[n-1-i][i] = board[n-i-1][n / 2];
            for (int i = 0; i < n; i++) board[i][n / 2] = backup[i];

        }
        return board;
    }
}