import java.io.*;
import java.util.*;

class Main {

    static int N;
    static int[][] map;
    static int min = Integer.MAX_VALUE;
    static int total = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++) {
                int n = Integer.parseInt(st.nextToken());
                map[i][j] = n;
                total += n;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 1; k < N; k++) {
                    for(int l = 1; l < N; l++) {
                        if(i+k+l >= N || j+l >= N || j-k < 0) continue;
                        set(i, j, k, l);
                    }
                }
            }
        }

        System.out.println(min);

        return;
    }

    private static void set(int x, int y, int d1, int d2) {
        boolean[][] check = new boolean[N][N];
        int[] cnt = new int[5];

        // 경계선 check
        for(int i = 0; i <= d1; i++) {
            check[x + i][y - i] = true;
            check[x + d2 + i][y + d2 - i] = true;
        }

        for(int i = 0; i <= d2; i++) {
            check[x + i][y + i] = true;
            check[x + d1 + i][y - d1 + i] = true;
        }

        // Area.1
        for(int i = 0; i < x + d1; i++) {
            for(int j = 0; j <= y; j++) {
                if(check[i][j]) break;
                cnt[0]+=map[i][j];
            }
        }

        // Area.2
        for(int i = 0; i <= x + d2; i++) {
            for(int j = N - 1; j > y; j--) {
                if(check[i][j]) break;
                cnt[1]+=map[i][j];
            }
        }

        // Area.3
        for(int i = x + d1; i < N; i++) {
            for(int j = 0; j < y - d1 + d2; j++) {
                if(check[i][j]) break;
                cnt[2]+=map[i][j];
            }
        }

        // Area.4
        for(int i = x + d2 + 1; i < N; i++) {
            for(int j = N - 1; j >= y - d1 + d2; j--) {
                if(check[i][j]) break;
                cnt[3]+=map[i][j];
            }
        }

        cnt[4] = total - (cnt[0] + cnt[1] + cnt[2] + cnt[3]);
        Arrays.sort(cnt);
        min = Math.min(min, cnt[4] - cnt[0]);
    }
}