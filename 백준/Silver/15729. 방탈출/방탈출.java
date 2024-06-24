import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] tmp = new int[n + 2];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            if(tmp[i] != arr[i]) {
                answer++;
                tmp[i + 1] = tmp[i + 1] == 1 ? 0 : 1;
                tmp[i + 2] = tmp[i + 2] == 1 ? 0 : 1;
            }
        }

        System.out.println(answer);
    }
}