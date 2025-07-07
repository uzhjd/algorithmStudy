import java.util.*;

class Solution {
    int[] check;
    
    public int solution(int n, int[][] costs) {
        int len = costs.length;
        check = new int[n];
        int answer = 0;
        
        for(int i = 0; i < n; i++)
            check[i] = i;
        
        Arrays.sort(costs, (o1, o2) -> o1[2] - o2[2]);
        
        for(int[] cost : costs) {
            int from = cost[0];
            int to = cost[1];
            int dis = cost[2];
            
            if(find(from) != find(to)) {
                union(from, to);
                answer += dis;
            }
        }
        
        return answer;
    }
    
    public int find(int v) {
        if(check[v] == v) return v;
        return check[v] = find(check[v]);
    }
    
    public void union(int a, int b) {
        int fa = find(a);
        check[fa] = b;
        
    }
}