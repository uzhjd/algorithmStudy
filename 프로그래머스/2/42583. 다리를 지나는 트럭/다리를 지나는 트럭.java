import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();
        int time = 0;
        int total = 0; // w
        int idx = 0;
        
        for(int i = 0; i < bridge_length; i++) que.add(0);
        
        while(!que.isEmpty()) {
            time++;
            total -= que.poll();
            
            if(idx < truck_weights.length) {
                int tmp = truck_weights[idx]; // n
                
                if(tmp + total > weight) que.add(0);
                else {
                    que.add(tmp);
                    total += tmp;
                    idx++;
                }
            }
        }
        
        return time;
    }
}
