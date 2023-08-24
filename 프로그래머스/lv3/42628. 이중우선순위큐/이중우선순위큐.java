import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        int[] answer = {0, 0};
        
        for(int i = 0; i < operations.length; i++) {
            st = new StringTokenizer(operations[i]);
            char op = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
            
            if(op == 'I') {
                maxPq.add(num);
                minPq.add(num);
            } else {
                if (maxPq.isEmpty()) continue;
                else if (num < 0) {
                    int min = minPq.poll();
                    maxPq.remove(min);
                } else {
                    int max = maxPq.poll();
                    minPq.remove(max);
                }
            }
        }
        
        if(!maxPq.isEmpty()) {
            answer[0] = maxPq.poll();
            answer[1] = minPq.poll();
        }
        
        return answer;
    }
}