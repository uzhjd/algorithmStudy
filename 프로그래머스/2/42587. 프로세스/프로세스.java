import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> que = new LinkedList<>();
        PriorityQueue<Integer> dq = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;
        
        for(int n : priorities) {
            que.add(n);
            dq.add(n);
        }
        
        while(!que.isEmpty()) {
            if(que.peek() == dq.peek()) {
                cnt++;
                que.poll();
                dq.poll();
                if(location == 0) return cnt;
                location--;
                if(location < 0) location = que.size() - 1;
            } else {
                int n = que.poll();
                que.add(n);
                location--;
                if(location < 0) location = que.size() - 1;
            }
        }
        
        return -1;
    }
}