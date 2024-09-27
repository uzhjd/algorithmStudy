import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String bomb = br.readLine();
        int len = bomb.length();




        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if(sb.length() >= len) {
                if(bomb.equals(sb.substring(sb.length()-len))) {
                    sb.delete(sb.length() - len, sb.length());
                }
            }
        }

        if (sb.length() < 1) System.out.println("FRULA");
        else System.out.println(sb.toString());

        return;
    }

}