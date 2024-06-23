import java.util.*;
import java.io.*;


class Main {

    static int[] cow;
    static int[] arr;
    static int n;
    static int total;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        cow = new int[n];
        arr = new int[n];
        total = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            cow[i] = Integer.parseInt(st.nextToken());
        }
        calcOrigin();

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < q; i++) {
            sb.append(calc(Integer.parseInt(st.nextToken())) + "\n");
        }

        System.out.println(sb);
    }

    static void calcOrigin() {
        for(int i = 0; i < n; i++) {
            int set = 1;

            for(int j = 0; j < 4; j++) {
                int idx = (i + j) % n;
                set *= cow[idx];
            }

            arr[i] = set;
            total += set;
        }
    }

    static int calc(int q) {

        for(int i = 0; i < 4; i++) {
            if(--q == -1) {
                q = n -1;
            }
            arr[q] = -arr[q];
            total += (2*arr[q]);
        }

        return total;
    }
}