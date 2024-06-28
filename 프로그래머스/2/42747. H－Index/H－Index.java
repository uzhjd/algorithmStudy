import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int len = citations.length;
        
        for(int i = 0; i < len; i++) {
            int tmp = citations[i];
            if(tmp >= len - i) {
                // answer = Math.max(answer, tmp);
                answer = len - i;
                break;
            }
        }
        
        return answer;
    }
}