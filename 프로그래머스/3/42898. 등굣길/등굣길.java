import java.util.*;

class Solution {
    
    public int solution(int m, int n, int[][] puddles) {
        int[][] DP = new int[n + 1][m + 1];
        int mod = 1000000007;
        
        for(int[] p : puddles) {
            DP[p[1]][p[0]] = -1;
        }
        
        
        DP[1][1] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(DP[i][j] == -1) continue;
                if(DP[i - 1][j] > 0) DP[i][j] += DP[i - 1][j] % mod;
                if(DP[i][j - 1] > 0) DP[i][j] += DP[i][j - 1] % mod;
            
            }
        }
        return DP[n][m] % mod;
    }
}
