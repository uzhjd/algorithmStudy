import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int i = 0; i < scoville.length; i++)
            pq.add(scoville[i]);
        
        if(pq.peek() >= K) return answer;
        
        for(int i = 0; i < scoville.length - 1; i++) {
            int tmp = pq.poll() + (pq.poll() * 2);
            pq.add(tmp);
            answer++;
            
            if(pq.peek() >= K) {
                return answer;
            }
        }
        
        
        return -1;
    }
}