import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] days = new int[len];
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            days[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
        }
        
        int max = days[0];
        int cnt = 1;
        for(int i = 1; i < len; i++) {
            int n = days[i];
            if(max < n) {
                que.add(cnt);
                cnt = 1;
                max = n;
            }
            else {
                cnt++;
            }
        }
        que.add(cnt);
        
        int size = que.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = que.poll();
        }
        
        return answer;
    }
}