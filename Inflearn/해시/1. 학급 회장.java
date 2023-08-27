import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       HashMap<Character, Integer> map = new HashMap<>();

       int n = Integer.parseInt(sc.nextLine());
       String str = "";
       char answer = ' ';

       str = sc.nextLine();

       for(char c : str.toCharArray()) {
           Integer cnt = map.get(c);

           if(cnt == null) cnt = 0;
           map.put(c, cnt + 1);
       }

       int max = 0;

       for(char key : map.keySet()) {
           if(map.get(key) > max) {
               answer = key;
               max = map.get(key);
           }
       }

        System.out.println(answer);

        return ;
    }
}
