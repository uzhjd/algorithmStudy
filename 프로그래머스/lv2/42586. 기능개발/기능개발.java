import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 1;
        int max = 0;
        
        for(int i = 0; i < progresses.length; i++) {
            int today = (int) (Math.ceil((100.0 - progresses[i]) / speeds[i]));
            
            if(i == 0) max = today;
            else {
                if(today > max) {
                    max = today;
                    q.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
        }
        
        q.add(cnt);
        
        int[] answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}