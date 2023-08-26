import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            
            while(true) {
                if(q.isEmpty()) {
                    q.add(truck);
                    sum += truck;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if(weight < sum + truck) {
                        q.add(0);
                        answer++;
                    } else {
                        q.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}