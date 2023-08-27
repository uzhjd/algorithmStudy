Time Limit Exceed

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] work = new int[N];

        for(int i = 0; i < N; i++) {
            work[i] = sc.nextInt();
        }

        for(int i = 0; i < N - K + 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int j = i; j < i + K; j++) {
                map.put(work[j], map.getOrDefault(work[j], 0) + 1);
            }

            System.out.print(map.size() + " ");
        }

        return;
    }
}
