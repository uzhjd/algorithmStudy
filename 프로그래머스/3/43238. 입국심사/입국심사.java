import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        int len = times.length;
        long min = times[0];
        long max = times[len - 1] * (long)n;
        long answer = -1;
        
        while(min <= max) {
            long mid = (min + max) / 2;
            long tmp = 0;
            
            for(int num : times) {
                tmp += (mid / num);
            }
            
            if(n > tmp) min = mid + 1;
            else {
                max = mid -1;
                answer = mid;
            }
        }
        
        return answer;
    }
}