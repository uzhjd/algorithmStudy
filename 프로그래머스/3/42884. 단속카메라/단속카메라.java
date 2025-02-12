import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[]o2) {
                return o1[1] - o2[1];
            }
        });
        
        int cam = routes[0][1];
        for(int[] route : routes) {
            if(cam < route[0]) {
                answer++;
                cam = route[1];
            }
        }
        
        return answer;
    }
}