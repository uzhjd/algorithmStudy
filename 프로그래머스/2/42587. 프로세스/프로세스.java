import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int[] seq = priorities.clone();
        Arrays.sort(seq);
        Queue<Integer> que = new LinkedList<>();
        int sIdx = priorities.length-1;
        int cnt = 0;
        
        for(int n : priorities) {
            que.add(n);
        }
        
        while(!que.isEmpty()) {
            if(seq[sIdx] == que.peek()) {
                cnt++;
                if(location == 0) break;
                sIdx--;
                que.poll();
                
            }
            else {
                que.add(que.poll());
            }
            location = (location-1 < 0) ? que.size() - 1 : location - 1;
        }
        
        return cnt;
    }
}