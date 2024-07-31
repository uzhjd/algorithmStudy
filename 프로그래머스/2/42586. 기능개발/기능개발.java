import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> tmp = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            
            if(remain % speeds[i] != 0) {
                remain = remain / speeds[i] + 1;
            } else remain /= speeds[i];
            
            q.add(remain);
        }
        
        int now = q.poll();
        int cnt = 1;
        while(!q.isEmpty()) {
            int n = q.poll();
            
            if(n > now) {
                tmp.add(cnt);
                now = n;
                cnt = 1;
            }
            else cnt++;
        }       
        tmp.add(cnt);
        int[] answer = new int[tmp.size()];
        int len = tmp.size();
        for(int i = 0; i < len; i++) {
            answer[i] = tmp.poll();
        }
        
        return answer;
    }
}