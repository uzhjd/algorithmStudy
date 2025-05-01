import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[]{0, 0};
        PriorityQueue<Integer> que = new PriorityQueue<>();
        PriorityQueue<Integer> deque = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String str : operations) {
            if(str.charAt(0) == 'I') {
                int tmp = Integer.parseInt(str.substring(2));
                
                que.add(tmp);
                deque.add(tmp);
            } else if(!que.isEmpty()) {
                if(str.charAt(2) != '-') {
                    int n = deque.poll();
                    que.remove(n);
                }
                else {
                    int n = que.poll();
                    deque.remove(n);
                }
            }
        }
        
        if(!que.isEmpty()) {
            answer[1] = que.poll();
            answer[0] = deque.poll();
        }
        
        // if(!que.isEmpty()) {
        //     int n = que.poll();
        //     answer[1] = n;
        //     deque.remove(n);
        // }
        // if(!deque.isEmpty()) {
        //     answer[0] = deque.poll();
        // }
        
        return answer;
    }
}