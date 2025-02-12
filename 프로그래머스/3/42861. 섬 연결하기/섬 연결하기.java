import java.util.*;

class Solution {
    
    int[] check;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        check = new int[n];
        
        for(int i = 0; i < n; i++) {
            check[i] = i;
        }
        
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        
        for(int[] cost : costs) {
            int from = cost[0];
            int end = cost[1];
            int dis = cost[2];
            
            int fa = find(from);
            int fb = find(end);
            
            if(fa != fb) {
                union(from, end);
                answer += dis;
            }
        }
        
        return answer;
    }
    
    public void union(int a, int b) {
        int fa = find(a);
        check[fa] = b;
    }
    
    public int find(int v) {
        if(v == check[v]) return v;
        return check[v] = (find(check[v]));
    }
}