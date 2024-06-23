import java.util.*;
import java.io.*;

class Main {

    static Set<Character> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            if(!case1(arr)) {
                case2(arr);
            }
        }
    }

    static boolean case1(String[] arr) {
        boolean answer = false;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if(!answer && !find(c)) {
                answer = true;
                set.add(c);

                sb.append("[" + arr[i].substring(0, 1) + "]" + arr[i].substring(1) + " ");
            } else {
                sb.append(arr[i] + " ");
            }
        }

        if(answer)
            System.out.println(sb);

        return answer;
    }

    static void case2(String[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int idx = -1;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length(); j++) {
                char c = arr[i].charAt(j);

                if (!flag && !find(c)) {
                    set.add(c);
                    flag = true;
                    idx = j;
                    cnt += 1;
                    break;
                }
            }

            if(flag && cnt == 1) {
                sb.append(arr[i].substring(0, idx) + "[" + arr[i].substring(idx, idx + 1) + "]" + arr[i].substring(idx + 1) + " ");
                cnt++;
            } else
                sb.append(arr[i] + " ");

        }

        System.out.println(sb);

        return;
    }

    static boolean find(char c) {
        if(set.contains(Character.toUpperCase(c)) || set.contains(Character.toLowerCase(c))) {
            return true;
        } else return false;
    }
}