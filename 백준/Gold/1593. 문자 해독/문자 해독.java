import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] w = new int[128];
        int[] tmp = new int[128];

        String word = br.readLine();
        for(int i = 0; i < g; i++) {
            char c = word.charAt(i);
            w[c] += 1;
        }

        String str = br.readLine();
        int start = 0;
        int cnt = 0;
        while(start <= s - g) {
            char c = str.charAt(start + cnt);
            tmp[c] += 1;

            cnt++;

            if(cnt == g) {

                char sc = str.charAt(start);
                if(Arrays.equals(tmp, w)) {
                    answer++;
                }
                tmp[sc] -= 1;
                cnt--;
                start++;
            }
        }

        System.out.println(answer);
    }
}