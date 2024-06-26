import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean tag = false;
        String answer = "";
        String tmp = "";
        for(char c : str.toCharArray()) {
            if(c == '<') tag = true;

            if(tag) {
                if(tmp.length() != 0) {
                    for (int i = tmp.length() - 1; i > -1; i--) {
                        answer += tmp.charAt(i);
                    }
                    tmp = "";
                }

                answer += c;
                if(c == '>') tag = false;
            } else {
                if(c == ' ') {
                    for(int i = tmp.length() - 1; i > -1; i--) {
                        answer += tmp.charAt(i);
                    }
                    answer += ' ';
                    tmp = "";
                } else {
                    tmp += c;
                }
            }
        }

        if(tmp.length() != 0) {
            for(int i = tmp.length() - 1; i > -1; i--) {
                answer += tmp.charAt(i);
            }
        }

        System.out.println(answer);
    }
}