import java.util.*;

class Solution {
    
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    public void dfs(int[] cards, boolean[] visited, int n, int cnt) {
        if(visited[n]) {
            pq.add(cnt);
            return;
        }
        
        visited[n] = true;
        dfs(cards, visited, cards[n] - 1, cnt + 1);
    }
    
    public int solution(int[] cards) {
        boolean[] visited = new boolean[cards.length];
        
        for(int i = 0; i < cards.length; i++) {
            if(!visited[i]) {
                dfs(cards, visited, i, 0);
            }
        }
        
        if(pq.size() != 1) {
            return pq.poll() * pq.poll();
        }
        
        return 0;
    }
}