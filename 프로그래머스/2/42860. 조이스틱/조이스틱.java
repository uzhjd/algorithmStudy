import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int moves = name.length() - 1;
        
        for(int i = 0; i < name.length(); i++) {
            int idx = i + 1;
            
            while(idx < name.length() && name.charAt(idx) == 'A') {
                idx++;
            }
            moves = Math.min(moves, i * 2 + name.length() - idx);
            moves = Math.min((name.length() - idx) * 2 + i, moves);
            
            // alpha
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }
        
        return answer + moves;
    }
}