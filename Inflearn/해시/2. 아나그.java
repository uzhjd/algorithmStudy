import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String answer = "YES";

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for(int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        for(char key : map1.keySet()) {
            if(map1.get(key) != map2.get(key)) {
                answer = "NO";
            }
        }

        System.out.println(answer);

        return;
    }
}
