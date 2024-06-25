import java.io.*;
import java.util.*;

class Main {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];

        for(int i = 1; i <= n; i++)
            arr[i] = i;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int button = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(button == 0) {
                union(a, b);
            } else if(button == 1)
                if(find(a) == find(b)) {
                    sb.append("YES" + "\n");
                } else {
                    sb.append("NO" + "\n");
                }
            }
        
        System.out.println(sb);
    }

    static int find(int v) {
        if(v == arr[v]) return v;
        else return arr[v] = find(arr[v]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if(a != b) {
            if(a > b) {
                arr[a] = b;
            } else
                arr[b] = a;
        }
    }
}