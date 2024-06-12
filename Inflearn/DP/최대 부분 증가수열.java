import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int tmp = 1;

            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    if(tmp <= dp[j]){
                        tmp = dp[j] + 1;
                    }
                }
            }
            dp[i] = tmp;
        }

        int answer = 0;
        for(int i = 1; i < n; i++) {
            if(answer < dp[i]) answer = dp[i];
        }

        System.out.println(answer);

        return;
    }

}