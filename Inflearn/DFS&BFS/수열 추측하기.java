import java.util.*;

public class DFS {

    static int N;
    static int F;
    static int[] answer;
    static int[][] check;
    static boolean[] ch;
    static int[] comb;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        F = sc.nextInt();
        answer = new int[N];
        check = new int[N + 1][N + 1];
        comb = new int[N + 1];
        ch = new boolean[N + 1];

        for(int i = 0 ; i < N; i++) {
            comb[i] = setComb(N - 1, i);
        }

        dfs(0, 0);

        return;
    }

    static public int setComb(int n, int r) {
        if(check[n][r] > 0) {
            return check[n][r];
        }
        if(n == r || r == 0) return 1;

        return check[n][r] = setComb(n - 1, r - 1) + setComb(n - 1, r);
    }


    static public void dfs(int L, int sum) {
        if(flag) return;
        if(L == N) {
            if(sum == F) {
                for(int n : answer) {
                    System.out.print(n + " ");
                }
                flag = true;
            }
            return;
        }
//        if(sum > F) return;

        else {
            for (int i = 1; i <= N; i++) {
                if (!ch[i]) {
                    ch[i] = true;
                    answer[L] = i;
                    dfs(L + 1, sum + (comb[L] * i));
                    ch[i] = false;
                }
            }
        }
    }
}