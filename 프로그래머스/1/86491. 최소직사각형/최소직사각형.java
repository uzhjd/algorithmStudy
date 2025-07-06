import java.util.*;

class Solution {
    
    public int solution(int[][] sizes) {
        int max = -1;
        int min = -1;
        
        for(int[] size : sizes) {
            int tMin = Math.min(size[0], size[1]);
            int tMax = Math.max(size[0], size[1]);
            
            min = Math.max(min, tMin);
            max = Math.max(max, tMax);
        }
        
        return min * max;
    }
}
