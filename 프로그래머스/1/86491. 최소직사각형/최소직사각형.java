import java.util.*;

class Solution {
    
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                if(w < sizes[i][0])
                    w = sizes[i][0];
                
                if (h < sizes[i][1])
                    h = sizes[i][1];
            } else {
                if(w < sizes[i][1])
                    w = sizes[i][1];
                
                if (h < sizes[i][0])
                    h = sizes[i][0];
            }
            System.out.println(w);
            System.out.println(h);
        }
        
        return w * h;
    }
}
