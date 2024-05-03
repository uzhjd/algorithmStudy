import java.util.*;

public class DFS {

    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        dfs(0, 1);

        return;
    }

    static public void dfs(int L, int s) {
        if(L == M) {
            for(int n : arr)
                System.out.print(n + " ");
            System.out.println();

            return;
        }

        for(int i = s; i <= N; i++) {
            arr[L] = i;
            dfs(L + 1, i + 1);
        }

        return;
    }
}