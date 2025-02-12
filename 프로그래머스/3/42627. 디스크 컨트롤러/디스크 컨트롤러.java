import java.util.*;

class Solution {

    // [[0, 3], [1, 9], [3, 5]]	
    
    public int solution(int[][] jobs) {
        int answer = 0;
        int idx = 0;
        int len = jobs.length;
        int now = 0;
        int cnt = 0;
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while(cnt < len) {
            while(idx < len && now >= jobs[idx][0]) {
                pq.add(jobs[idx++]);
            }
            
            if(pq.isEmpty()) now = jobs[idx][0];
            else {
                int[] tmp = pq.poll();
                now += tmp[1];
                answer += now - tmp[0];
                cnt++;
            }
        }
        
        return answer/len;
    }
}