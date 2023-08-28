import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        String str = sc.nextLine();

        for(int i = 1; i <= str.length(); i++) { // 길이
           for(int j = 0; j + i <= str.length(); j++) { // 시작점
               String s = str.substring(j, j + i);

               if(!map.containsKey(s)) {
                   map.put(s, i);
                   answer++;
               }
           }
        }

        System.out.println(answer);

        return;
    }
}