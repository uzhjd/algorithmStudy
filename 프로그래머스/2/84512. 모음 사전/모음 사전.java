import java.util.*;

class Solution {
    
    public int solution(String word) {
        int answer = 0;
        String dir = "AEIOU";
        int[] order = new int[]{781, 156, 31, 6, 1};
        
        int len = word.length();
        for(int i = 0; i < len; i++) {
            answer += (dir.indexOf(word.charAt(i)) * order[i]) + 1;
        }
        
        return answer;
    }
}