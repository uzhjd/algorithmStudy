import java.util.*;

public class Main {

    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int C;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        C = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        DFS(0, 0);
        System.out.println(max);

        return;
    }

    static public void DFS(int sum, int L) {
        if(sum > C) return;
        if(L == N) {
            max = Math.max(sum, max);
            return;
        }

        DFS(sum + arr[L], L + 1);
        DFS(sum, L + 1);

        return;
    }
}