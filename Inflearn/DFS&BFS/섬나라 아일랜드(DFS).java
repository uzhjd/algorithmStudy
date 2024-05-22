import java.util.*;

public class DFS {

    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        N = sc.nextInt();
        board = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(board[i][j] == 1) {
                    cnt++;

                    board[i][j] = 0;
                    dfs(i, j);
                }
            }
        }


        System.out.println(cnt);

        return;
    }

    static public void dfs(int x, int y) {

        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                dfs(nx, ny);
            }
        }

    }
}