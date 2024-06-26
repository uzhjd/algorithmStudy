import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            boolean fin = false;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];

            for (int i = 0; i < n - 1; i++) {
                st = new StringTokenizer(br.readLine());

                int parents = Integer.parseInt(st.nextToken());
                int child = Integer.parseInt(st.nextToken());

                arr[child] = parents;
            }
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int nodeA = a;
            while (nodeA != 0 && !fin) {
                int nodeB = b;

                while (nodeB != 0) {
                    if (nodeA == nodeB) {
                        System.out.println(nodeB);
                        fin = true;
                        break;
                    }
                    nodeB = arr[nodeB];
                }
                nodeA = arr[nodeA];
            }
        }
    }
}