import java.util.*;

class Solution {
    
    Set<String> set = new HashSet<>();
    int len;
    int answer = Integer.MAX_VALUE;
    
    public void DFS(String[] words, String begin, String target, int cnt) {
        if(begin.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }
        
        for(String s : words) {
            if(set.contains(s))
                continue;
            
            int k = 0;
            
            for(int i = 0; i < len; i++) {
                if(s.charAt(i) != begin.charAt(i)) {
                    k++;
                }
            }
            
            if(k == 1) {
                set.add(s);
                DFS(words, s, target, cnt + 1);
                set.remove(s);
            }
        }
        
    }
    
    public int solution(String begin, String target, String[] words) {
        len = begin.length();
        
        set.add(begin);
        DFS(words, begin, target, 0);
        
        if(answer > 60) answer = 0;
        
        return answer;
    }
}