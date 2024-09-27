import java.util.*;
import java.io.*;

class Main {

    private static int[] arr;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            arr[i] = i;
        }

        for(int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            move(i, j, k);
        }


        for(int i = 1; i <= N; i++)
            System.out.print(arr[i] + " ");
    }

    public static void move(int begin, int end, int mid) {

        Queue<Integer> que = new LinkedList<>();

        for(int i = begin; i < mid; i++) {
            que.add(arr[i]);
        }

        for(int i = mid; i <= end; i++) {
            arr[begin++] = arr[i];
        }

        while(!que.isEmpty()) {
            arr[begin++] = que.poll();
        }
    }
}