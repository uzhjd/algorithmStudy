import java.util.*;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BFS {

    static int[][] board;
    static int cnt = 0;
    static int L = 0;
    static int M;
    static int N;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<Point> que = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        M = sc.nextInt();
        N = sc.nextInt();
        board = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int n = sc.nextInt();
                if(n == 0) flag = false;
                if (n == 0) {
                    cnt++; // 익혀야 할 tomato 개수
                } else if(n == 1) {
                    que.add(new Point(i, j)); // 익은 토마토
                    n = -1;
                }
                board[i][j] = n;
            }
        }

        if(flag) System.out.println(0); // 이미 다 익은 것들
        else bfs();

        return;
    }

    static public void bfs() {

        while(!que.isEmpty() && cnt > 0) {
            int length = que.size();
            L++;

            for(int j = 0; j < length; j++) {
                Point p = que.poll();

                for(int i = 0; i < 4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];

                    if(cnt == 0) {
                        System.out.println(L);
                        return;
                    } else if(nx > -1 && ny > -1 && nx < N && ny < M && board[nx][ny] == 0) {
                        board[nx][ny] = -1;
                        que.add(new Point(nx, ny));
                        cnt--;
                    }
                }
            }
        }
        System.out.println(-1);

        return;
    }
}