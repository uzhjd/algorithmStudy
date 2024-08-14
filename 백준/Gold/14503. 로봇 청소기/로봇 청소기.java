import java.io.*;
import java.util.*;


class Main {

    static int N, M, answer;
    static int[][] map;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());;
        int dir = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());;
            }
        }

        answer = 1;
        DFS(x, y, dir);

        System.out.println(answer);

        return;
    }

    public static void DFS(int x, int y, int dir) {
        map[y][x] = -1;

        for(int i = 0; i < 4; i ++) {
            dir--;
            if (dir == -1) dir = 3;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx > -1 && nx < M && ny > -1 && ny < N && map[ny][nx] == 0) {
                answer++;
                DFS(nx, ny, dir);

                return;
            }
        }

        int bx = x + dx[dir] * (-1);
        int by = y + dy[dir] * (-1);

        if(by>=0 && by<N && bx>=0 && bx<M && map[by][bx] != 1) DFS(bx,by,dir);
    }
}