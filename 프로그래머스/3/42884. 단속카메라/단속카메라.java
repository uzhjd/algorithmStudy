import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        int answer = 1;
        int now = routes[0][1];
        int len = routes.length;
        
        for(int i = 1; i < len; i++) {
            if(now < routes[i][0]) {
                answer++;
                now = routes[i][1];
            }
        }
        
        return answer;
    }
}