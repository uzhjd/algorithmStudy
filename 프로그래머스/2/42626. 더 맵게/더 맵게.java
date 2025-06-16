import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : scoville) pq.add(n);
        
        int tmp = 0;
        while(pq.size() > 1) {
            if(pq.peek() >= K) return answer;
            
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        
        if(pq.poll() >= K) return answer;
        return -1;
    }
}