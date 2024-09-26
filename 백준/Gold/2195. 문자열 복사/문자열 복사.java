import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String P = br.readLine();
        int answer = 0;
        int idx = 0;

        for(int i = 0; i < P.length(); i++) {
            if(S.indexOf(P.substring(idx, i+1)) != -1) continue;
            idx = i;
            answer++;
        }

        System.out.println(answer+1);
    }

}