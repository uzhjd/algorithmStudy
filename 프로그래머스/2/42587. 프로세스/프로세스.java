import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> que = new LinkedList<Integer>();
        Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int cnt = 0;
        
        for(int n : priorities) {
            que.add(n);
            pq.add(n);
        }
        
        
        while(!que.isEmpty()) {
            int n = que.poll();
            
            if(pq.peek() == n) {
                cnt++;
                
                if(location == 0) return cnt;
                else pq.poll();
                
            } else {
                que.add(n);
            }
            
            if(location == 0) location = que.size() - 1;
            else location--;
        }
        
        return -1;
    }
}