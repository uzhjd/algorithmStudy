import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        char answer = 'U';

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(map.containsKey(num)) {
                answer = 'D';
                break;
            }
            map.put(num, i);
        }

        System.out.println(answer);

        return;
    }
}
