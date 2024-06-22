import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        int[] answer = new int[2];

        int num = (int)Math.pow(n, 2);
        int x = 0;
        int y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int rotate = n - 1;
        int cnt = 0;

        board[y][x] = num--;
        for(int i = 0; i < rotate; i++) {
            y += dy[3];
            x += dx[3];

            board[y][x] = num--;
        }

        while(num > 0) {
            for(int i = 0; i < 4; i ++) {

                for(int j = 0; j < rotate; j++) {
                    y += dy[i];
                    x += dx[i];

                    board[y][x] = num--;

                }
                cnt++;
                if(cnt % 2 == 0) {
                    rotate--;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j] + " ");


                if(board[i][j] == target) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                }
            }
            sb.append("\n");
        }
        sb.append(answer[0] + " " + answer[1]);

        System.out.println(sb);
    }
}