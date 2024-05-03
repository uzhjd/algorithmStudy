import java.util.*;

public class DFS {

    static int N;
    static int M;
    static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        answer = new int[M];

        dfs(0);

        return;
    }

    static public void dfs(int L) {
        if(L == M) {
            for(int n : answer) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {
            answer[L] = i + 1;
            dfs(L + 1);
        }

        return;
    }
}