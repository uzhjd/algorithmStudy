import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            int len = end - start + 1;
            int[] tmp = new int[len];
            
            for(int j = start - 1; j < end; j++) {
                tmp[j - start + 1] = array[j];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[k - 1];
        }
        return answer;
    }
    
}

