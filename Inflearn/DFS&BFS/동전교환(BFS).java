import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[]arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();

        boolean[] ch = new boolean[M + 1];
        BFS(arr, ch, M);

        return;
    }

    static public void BFS(int[] arr, boolean[] ch, int M) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        int L = 0;

        while(!q.isEmpty()) {
            int len = q.size();
            L++;

            for(int i = 0; i < len;i++) {
                int n = q.poll();

                for(int j = 0; j < arr.length; j++) {
                    int nx = n + arr[j];
                    if(nx > M || ch[nx]) continue;
                    if(nx == M) {
                        System.out.println(L);
                        return;
                    }

                    q.add(nx);
                    ch[nx] = true;
                }
            }
        }

        return;
    }
}