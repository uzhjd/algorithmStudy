import java.io.*;
import java.util.*;

class Main {

    static boolean[][] arr;
    static boolean check;
    static int col;
    static int row;
    static int n;
    static int answer;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {-1, 1, 0, 0}; // 상하좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            arr = new boolean[row][col];

            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = true;
            }


            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    check = false;
                    dfs(j, i);
                    if(check) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    static public void dfs(int x, int y) {
        if(x < 0 || x >= col || y < 0 || y >= row) return;
        if(!arr[y][x]) return;

        arr[y][x] = false;
        check = true;
        for(int i = 0; i < 4; i++) {
            dfs(x + dx[i], y + dy[i]);
        }
    }
}