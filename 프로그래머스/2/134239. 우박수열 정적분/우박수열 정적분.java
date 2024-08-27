import java.util.*;

class Solution {
    
    ArrayList<Integer> arr;
    int size;
    
    public double[] solution(int k, int[][] ranges) {
        int len = ranges.length;
        double[] answer = new double[len];
        arr = new ArrayList<>();
        
        arr.add(k);
        while(k > 1) {
            if(k % 2 == 0) k /= 2;
            else k = k * 3 + 1;
            
            arr.add(k);
        }
        
        size = arr.size();
        for(int i = 0; i < len; i++) {
            int[] range = ranges[i];
            
            answer[i] = sep(range[0], range[1]);
            
        }
        
        
        return answer;
    }
    
    public double sep (int a, int b) {
        b += size - 1;
        
        if(a == b) return 0.0;
        if(b < a) return -1.0;
        
        double result = 0;
        for(int i = a; i < b; i++) {
            int ax = arr.get(i);
            int bx = arr.get(i+1);
            
            result += (ax + bx);
        }
        
        return result / 2.0;
    }
}