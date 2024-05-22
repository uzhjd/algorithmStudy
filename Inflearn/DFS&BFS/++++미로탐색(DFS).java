import java.util.*;

public class DFS {

    static int[][] board;
    static int cnt = 0;

    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];

        for(int i = 1; i < 8; i++) {
            for(int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        dfs(1, 1);

        System.out.println(cnt);
        return;
    }

    static public void dfs(int x, int y) {
        if(x == 7 && y == 7) {
            cnt ++;
            return;
        }

        for(int i = 0; i < 4; i ++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 1 && ny >=1 &&nx <= 7 && ny <= 7 && board[nx][ny] ==0) {
                board[nx][ny] = 1;
                dfs(nx, ny);
                board[nx][ny] = 0;

            }
        }

        return;
    }
}