import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> mapT = new HashMap<>();
        int answer = 0;

       String S = sc.nextLine();
       String T = sc.nextLine();

        for(char c : T.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

       for(int i = 0; i < S.length() - T.length() + 1; i++) {
           HashMap<Character, Integer> map = new HashMap<>();

           for(int j = i; j < i + T.length(); j++) {
               map.put(S.charAt(j), map.getOrDefault(S.charAt(j), 0) + 1);
           }

           answer++;

           for(char c : mapT.keySet()) {
               if(mapT.get(c) != map.get(c)) {
                   answer--;
                   break;
               }
           }
       }

        System.out.println(answer);

        return;
    }
}
