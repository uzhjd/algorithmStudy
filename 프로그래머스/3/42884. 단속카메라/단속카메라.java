import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] route1, int[] route2) {
                return route1[1] - route2[1];
            }
        });
        
        int cam = routes[0][1];
        for(int[] route : routes) {
            if(cam < route[0]) {
                cam = route[1];
                answer++;
            }
                
        }
        
        return answer;
    }
}