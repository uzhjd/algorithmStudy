import java.util.*;

public class Main {

    static int target = 0;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            arr[i] = n;

            target += n;
        }

        if(target % 2 != 0) {
            System.out.println("NO");
            return;
        }
        target /= 2;
        if(DFS(arr, 0, 0) == 1) System.out.println("YES");
        else System.out.println("NO");

        return;
    }

    static public int DFS(int[] arr, int sum, int L) {
        if(sum == target)
            return 1;
        if(L >= N) return 0;

        if(DFS(arr, sum + arr[L], L+1) == 1) return 1;
        if(DFS(arr, sum, L+1) == 1) return 1;

        return 0;
    }
}