import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        int len = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < len; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        return participant[participant.length-1];
    }
}