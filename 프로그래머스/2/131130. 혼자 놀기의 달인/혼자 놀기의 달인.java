import java.util.*;

class Solution {
    
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    public void dfs(int i, int[] cards, boolean[] visited, int cnt) {
        if(visited[i]) {
            pq.add(cnt);
            return;
        }

        visited[i] = true;
        dfs(cards[i] - 1, cards, visited, cnt + 1);
    }
    
    public int solution(int[] cards) {
        int answer = 1;
        boolean[] visited = new boolean[cards.length];
            
        for(int i = 0; i < cards.length; i++) {
            if(visited[i]) continue;
            
            dfs(i, cards, visited, 0);
            
        }
        
        if(pq.size() > 1)
            return pq.poll() * pq.poll();
        
        return 0;
    }
}