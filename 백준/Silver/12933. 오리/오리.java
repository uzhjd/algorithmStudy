import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int answer = 0;
        char[] sound = {'q', 'u', 'a', 'c', 'k'};
        int remain = arr.length;
        int cnt = 0;

        if(remain % 5 != 0) {
            System.out.println("-1");
            return;
        }

        while(remain > 0) {
            int idx = 0;
            int i = 0;
            boolean check = false;
            int[] tmp = new int[5];

            while(idx < arr.length) {
                if (arr[idx] == sound[i]) {
                    tmp[i++] = idx;
                    if (i == 5) {
                        i = 0;
                        check = true;
                        remain -= 5;
                        for(int j = 0; j < 5; j++) {
                            arr[tmp[j]] = '\0';
                        }
                    }
                }
                idx++;
            }

           if(check)
               answer++;
           else break;
        }

        System.out.println(remain > 0 ? -1 : answer);



    }

}