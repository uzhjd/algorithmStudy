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
    static int N;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        bfs();

        return;
    }

    static public void bfs() {
        Queue<Point> que = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(board[i][j] == 1) {
                    cnt++;
                    board[i][j] = 0;
                    que.add(new Point(i, j));
                }
                while(!que.isEmpty()) {
                    Point p = que.poll();

                    for(int k = 0; k < 8; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];

                        if(nx > -1 && ny > -1 && nx < N && ny < N && board[nx][ny] == 1) {
                            board[nx][ny] = 0;
                            que.add(new Point(nx, ny));
                        }
                    }
                }
            }
        }

        System.out.println(cnt);

        return;
    }
}