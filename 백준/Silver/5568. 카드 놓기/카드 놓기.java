import java.io.*;
import java.util.*;

class Main {

    static int n;
    static int k;
    static String[] arr;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new String[n];
        boolean[] check = new boolean[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        dfs(0, 0, check, "");

        System.out.println(set.size());
    }

    static void dfs(int L, int cnt, boolean[] check, String tmp) {
        if(cnt == k) { // 카드 갯수만큼 다 찾은 것
            if(!set.contains(tmp)) {
                set.add(tmp);
            }

            return;
        }
        if(L == n) { // 끝까지 다 돈거
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                dfs(L + 1, cnt + 1, check, tmp + arr[i]);
                check[i] = false;
            }
        }
    }
}