import java.util.*;

class Solution {
    static int [] parent;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        for(int i = 0; i < n; i++)
            parent[i] = i;
        
        Arrays.sort(costs, (int[]c1, int[]c2) -> c1[2] - c2[2]);
        
        for(int[] node : costs) {
            int from = node[0];
            int to = node[1];
            int cost = node[2];
            
            int fromParent = Parent(from);
            int toParent = Parent(to);
            // 사이클 생성 방지
            if(fromParent == toParent) continue;
            
            answer += cost;
            parent[toParent] = fromParent;
        }
        
        return answer;
    }
    
    public int Parent(int node) {
        if(node == parent[node]) return node;
        return parent[node] = Parent(parent[node]);
    }
}