import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt = 0;
        
        for(int n : scoville)
            pq.add(n);
        
        while(pq.size() > 1) {            
            if(pq.peek() >= K) return cnt;
            
            pq.add(pq.poll() + pq.poll() * 2);
            cnt++;
        }
        
        if(pq.poll() >= K) return cnt;
        return -1;
    }
}