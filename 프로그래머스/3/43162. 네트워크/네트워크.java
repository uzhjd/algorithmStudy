import java.util.*;

class Solution {
    boolean[] visit;
    boolean flag;
    
	public int solution(int n, int[][] computers) {
        int answer = 0;
	    visit = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            flag = false;
            if(DFS(n, i, computers)) answer++;
        }
        
        return answer;
    }    
    
    public boolean DFS(int n, int k, int[][] computers) {
        if(n == k) return flag;
        
        for(int i = 0; i < n; i++) {
            if(computers[k][i] == 1 && !visit[i]) {
                flag = true;
                visit[i] = true;
                DFS(n, i, computers);
            }
        }
        
        return flag;
    }
}

