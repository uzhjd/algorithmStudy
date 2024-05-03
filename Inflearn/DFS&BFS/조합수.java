import java.util.*;

public class DFS {

    static int N;
    static int M;
    static int[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        check = new int[N + 1][N + 1];

        System.out.println(dfs(N, M));

        return;
    }

    static public int dfs(int n, int m) {
        if(m == 0 || n == m) return 1;
        if(m == 1) return n;
        if(check[n][m] > 0) return check[n][m];

        check[n][m] = dfs(n-1, m-1) + dfs(n-1, m);
        return check[n][m];
    }

}