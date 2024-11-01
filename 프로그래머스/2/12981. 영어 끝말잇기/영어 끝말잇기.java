import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        char e = words[0].charAt(words[0].length()-1);
        
        for(int i = 1; i < words.length; i++) {
            char s = words[i].charAt(0);
            
            if(e != s || set.contains(words[i])) {
                int mod = (i+1) % n;
                // answer[0] = n - mod;
                // if(mod > 0) answer[1] = (i+1) / n + 1;
                // else answer[1] = (i+1) / n;
                
                answer[0] = mod == 0 ? n : mod;  // 위반한 사람의 번호
                answer[1] = (i + 1) / n + (mod == 0 ? 0 : 1);  // 차례
                
                break;
            }
            
            set.add(words[i]);
            e = words[i].charAt(words[i].length()-1);
        }
        
        return answer;
    }
}