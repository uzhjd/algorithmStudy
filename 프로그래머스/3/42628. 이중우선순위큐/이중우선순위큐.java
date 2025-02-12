import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s : operations) {            
            if(s.charAt(0) == 'I') {
                int n = Integer.parseInt(s.substring(2));
                pq.add(n);
                rq.add(n);
            } else {
                if(s.charAt(2) == '1' && !rq.isEmpty()) {
                    int t = rq.poll();
                    pq.remove(t);
                } else if (s.charAt(2) == '-' && !pq.isEmpty()){
                    int t = pq.poll();
                    rq.remove(t);
                }
            }
        }
        
        int[] answer = new int[2];
        if(pq.isEmpty() && rq.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        }
        else {
            answer[0] = rq.poll();
            answer[1] = pq.poll();
        }
        
        return answer;
    }
}