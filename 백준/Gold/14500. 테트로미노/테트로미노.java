import java.io.*;
import java.util.*;

class Main {

    static int N;
    static int M;
    static int max = Integer.MIN_VALUE;
    static int [][] board;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {-1, 1, 0, 0}; // 상하좌우
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visit = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                visit[i][j] = true;
                DFS(i, j, board[i][j], 1);
                visit[i][j] = false;
            }
        }

        System.out.println(max);
    }

    public static void DFS(int x, int y, int tmp, int cnt) {
        if(cnt == 4) {
            max = Math.max(max, tmp);
            return;
        }

        for(int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx < 0 || cy < 0 || cx >= N || cy >= M || visit[cx][cy])
                continue;

            if(cnt == 2) {
                visit[cx][cy] = true;
                DFS(x, y, tmp + board[cx][cy], cnt + 1);
                visit[cx][cy] = false;
            }

            visit[cx][cy] = true;
            DFS(cx, cy, tmp + board[cx][cy], cnt + 1);
            visit[cx][cy] = false;

        }
    }
}