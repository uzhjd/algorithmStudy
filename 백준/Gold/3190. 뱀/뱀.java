import java.io.*;
import java.util.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Dir implements Comparable<Dir> {
    int sec;
    char c;

    Dir(int s, char c) {
        this.sec = s;
        this.c = c;
    }

    @Override
    public int compareTo(Dir d) {
        return this.sec - d.sec;
    }
}

class Main {

    static int N;
    static int now = 0; // current time
    static int direction = 1; // current dir(start: 1_오른쪽)
    static int[][] apple;
    static PriorityQueue<Dir> change;
    static ArrayList<Point> snake;
    static boolean gameOver = false;
    static int[] dx = new int[]{0, 1, 0, -1}; // 위 오 아래 왼
    static int[] dy = new int[]{-1, 0, 1, 0}; // 위 오 아래 왼


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        int K = Integer.parseInt(br.readLine());
        apple = new int[N][N];
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;

            apple[y][x] = 1;
        }

        int L = Integer.parseInt(br.readLine());
        change = new PriorityQueue<>();
        for(int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());

            int sec = Integer.parseInt(st.nextToken()) + 1;
            char dir = st.nextToken().charAt(0);

            change.add(new Dir(sec, dir));
        }

        snake = new ArrayList<>();
        snake.add(new Point(0, 0));

        while(!gameOver) {
            now++;
            isChange();

            // 다음 이동할 곳
            Point p = snake.get(0);
            int nx = p.x + dx[direction];
            int ny = p.y + dy[direction];

            if(isGameOver(nx, ny)) break;

            snake.add(0, new Point(nx, ny));

            if(apple[ny][nx] == 1) {
                apple[ny][nx] = 0;
            } else {
                snake.remove(snake.size() - 1);
            }
        }

        System.out.println(now);

        return;
    }

    public static void isChange() {
        if(change.isEmpty()) return;

        Dir d = change.peek();
        if(d.sec == now) {
            change.poll();

            if(d.c == 'D') { // right
                direction++;
                if(direction == 4) direction = 0;
            } else if(d.c == 'L') { // left
                direction--;
                if(direction == -1) direction = 3;
            }
        }
    }

    public static boolean isGameOver(int x, int y) {

        if(x < 0 || x >= N || y < 0 || y >= N) { // 벽
//            now++;
            gameOver = true;
            return true;
        }

        for(int i = 0; i < snake.size(); i++) {
            if(snake.get(i).x == x && snake.get(i).y == y) {
                gameOver = true;
                return true;
            }
        }

        return false;
    }

}