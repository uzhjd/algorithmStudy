import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coin = new int[n];

        for(int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int total = sc.nextInt();
        int[] dp = new int[total + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 0; i < n; i++) {
            for(int j = coin[i]; j <= total; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        System.out.println(dp[total]);

        return;
    }
}