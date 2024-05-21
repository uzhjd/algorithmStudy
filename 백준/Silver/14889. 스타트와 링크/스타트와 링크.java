import java.util.*;

public class Main {

    static int[][] board;
    static boolean[] check;
    static int N;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        check = new boolean[N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        comb(0, 0);

        System.out.println(answer);

        return;
    }

    static public void comb(int idx, int L) {
        if(L == N / 2) {
            dfs();

            return;
        }

        for(int i = idx; i < N; i++) {
            if(!check[i]) {
                check[i] = true;
                comb(i + 1, L + 1);
                check[i] = false;
            }
        }
    }

    static public void dfs() {
        int star = 0;
        int link = 0;

        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                if(check[i] && check[j]) {
                    star += board[i][j];
                    star += board[j][i];
                } else if(!check[i] && !check[j]) {
                    link += board[i][j];
                    link += board[j][i];
                }
            }
        }

        int dif = Math.abs(star - link);
        if(dif == 0) {
            System.out.println(0);
            System.exit(0);
        }

        answer = Math.min(answer, dif);
        return;
    }
}