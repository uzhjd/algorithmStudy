import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : scoville) {
            pq.add(n);
        }
        
        int cnt = 0;
        int tmp = 0;
        while(pq.peek() < K && pq.size() > 1) {
            tmp = pq.poll() + pq.poll()*2;
            pq.add(tmp);
            cnt++;
            tmp = 0;
        }
        
        if(pq.poll() < K) cnt = -1;
        return cnt;        
    }
}