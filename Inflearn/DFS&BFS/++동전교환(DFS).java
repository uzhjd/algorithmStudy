import java.util.*;

public class Main {

    static Integer[] arr;
    static boolean[] ch;
    static int M;
    static int N;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new Integer[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        M = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        ch = new boolean[M + 1];
        DFS(0, 0);

        System.out.println(min);

        return;
    }

    static public void DFS(int sum, int cnt) {
        if(sum > M || cnt >= min) return;
        if(sum == M) {
            min = Math.min(min, cnt);
            return;
        }

        for(int i = 0; i < N; i++)
            DFS(sum + arr[i], cnt + 1);

        return;
    }
}