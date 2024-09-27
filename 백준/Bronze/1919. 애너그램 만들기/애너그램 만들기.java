import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int answer = 0;

        String str1 = br.readLine();
        String str2 = br.readLine();

        for(char c : str1.toCharArray()) {
            int idx = c - 'a';
            arr1[idx]++;
        }

        for(char c : str2.toCharArray()) {
            int idx = c - 'a';
            arr2[idx]++;
        }

        for(int i = 0; i < 26; i++) {
            int dif = arr1[i] - arr2[i];
            if(dif == 0) continue;

            answer += Math.abs(dif);
        }

        System.out.println(answer);
    }

}