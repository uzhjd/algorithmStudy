import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        int i = 0;
        int total = 0;
        int cnt = 0;
        
        while(i < truck_weights.length) {
            answer++;
            
            if(answer > bridge_length) { // 첫차 도착
                int n = que.poll();
                total -= n;
                if(n != 0) cnt--;
            }
            
            if(total + truck_weights[i] <= weight && cnt <= bridge_length) {
                que.add(truck_weights[i]);
                cnt++;
                total += truck_weights[i];
                i++;
            }
            else {
                que.add(0);
            }
        }
        
        return answer + bridge_length;
        
    }
}