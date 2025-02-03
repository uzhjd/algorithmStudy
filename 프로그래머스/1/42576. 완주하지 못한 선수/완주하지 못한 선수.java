import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int n = completion.length;
        for(int i = 0; i < n; i++) {
            String par = participant[i];
            if(par.equals(completion[i])) continue;
            return par;
        }
        
        return participant[n];
    }
}