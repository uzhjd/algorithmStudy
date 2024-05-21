import java.util.*;

class Point{
    public int x, y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BFS {

    static int[][] board = new int[8][8];
    static int cnt = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean flag = false;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 8; i++) {
            for(int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs();

        return;
    }

    static public void bfs() {
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(1, 1));
        board[1][1] = 1;

        while(!que.isEmpty() && !flag) {
            int length = que.size();
            cnt++;

            for(int j = 0; j < length; j++) {
                Point p = que.poll();

                for(int i = 0; i < 4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];

                    if(nx == 7 && ny == 7 && board[nx][ny] == 0) {
                        System.out.println(cnt);
                        flag = true;
                        return;
                    } else if(nx > 0 && ny > 0 && nx < 8 && ny < 8 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        que.add(new Point(nx, ny));
                    }
                }
            }
        }
        System.out.println(-1);

        return;
    }
}