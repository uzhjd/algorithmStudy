import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> dq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s : operations) {
            String[] tmp = s.split(" ");
            String a = tmp[0];
            String b = tmp[1];
            
            if(a.equals("I")) {
                int n = Integer.parseInt(tmp[1]);
                pq.add(n);
                dq.add(n);
            } else {
                if(b.equals("1") && !dq.isEmpty()) {
                    int t = dq.poll();
                    pq.remove(t);
                } else if (b.equals("-1")  && !pq.isEmpty()){
                    int t = pq.poll();
                    dq.remove(t);
                }
            }
        }
        
        int[] answer = new int[2];
        if(pq.isEmpty() && dq.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        }
        else {
            answer[0] = dq.poll();
            answer[1] = pq.poll();
        }
        
        return answer;
    }
}