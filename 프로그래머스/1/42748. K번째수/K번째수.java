import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int T = commands.length;
        int[] answer = new int[T];
        
        for(int i = 0; i < T; i++) {
            int s = commands[i][0];
            int e = commands[i][1];
            int idx = commands[i][2];
            
            int[] tmp = Arrays.copyOfRange(array, s-1, e);
            Arrays.sort(tmp);
            // for(int n : tmp) System.out.print(n + " ");
            // System.out.println();
            answer[i] = tmp[idx-1];
        }
        
        return answer;
    }
}

