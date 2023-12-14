import java.util.*;

class Solution {
    
    public int solution(String word) {
        int answer = word.length();
        String vowels = "AEIOU";
        int[] change = new int[]{781, 156, 31, 6, 1};
        
        for(int i = 0; i < word.length(); i++) {
            answer += change[i] * vowels.indexOf(word.charAt(i));
        }
        
        return answer;
    }
}