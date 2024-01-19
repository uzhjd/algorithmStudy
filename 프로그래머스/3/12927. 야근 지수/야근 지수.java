import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        
        for(int work : works) {
            pq.add(work);
        }
        
        for(int i = 0; i < n; i++) {
            long tmp = pq.peek() - 1;
            if(tmp < 0) break;
            pq.add(pq.poll() - 1);
        }
        
        while(!pq.isEmpty()) {
            answer += Math.pow(pq.poll(), 2);
        }
        
        return answer;
    }
}