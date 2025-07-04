import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> que = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;
        
        for(int n : priorities) {
            que.add(n);
            pq.add(n);
        }
        
        while(true) {
            int n = que.poll();
            if(pq.peek() == n) {
                pq.poll();
                cnt++;
                if(location == 0) break;
            }
            else {
                que.add(n);
            }
                location--;
                if(location < 0) location = que.size() - 1;
        }
        
        return cnt;
    }
}