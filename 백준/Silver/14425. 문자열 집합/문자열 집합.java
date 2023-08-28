import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            map.put(sc.nextLine(), i);
        }

        for(int i = 0; i < K; i++) {
            if(map.containsKey(sc.nextLine())) answer++;
        }

        System.out.println(answer);

        return;
    }
}