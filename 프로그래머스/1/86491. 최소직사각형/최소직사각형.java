import java.util.*;

class Solution {
    
    public int solution(int[][] sizes) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int[] s : sizes) {
            max = Math.max(max, Math.max(s[0], s[1]));
            min = Math.max(min, Math.min(s[0], s[1]));
        }
    
        return max * min;
    }
}
