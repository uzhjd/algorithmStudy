import java.util.*;


public class Main {

    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dp = new int[N + 1];

        dp[1] = 1;
        dp[2] = 2;

        System.out.println(DP(N));

        return;
    }

    static public int DP(int n) {
        if(n == 1 || n == 2) return dp[n];

        if(dp[n] > 0) return dp[n];

        return dp[n] = DP(n - 1) + DP(n - 2);
    }

}