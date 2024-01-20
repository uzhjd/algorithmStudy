import java.util.*;

class Solution {
    int answer = Integer.MAX_VALUE;
    int[] visited;
    int total = 0;
    
    public int solution(int[] picks, String[] minerals) {
        visited = new int[picks.length];
        
        for(int pick : picks)
            total += pick;
        
        for(int i = 0; i < picks.length; i++) {
            if(visited[i] == picks[i]) continue;
            
            visited[i]++;
            dfs(1, 0, i, 0, picks, minerals);
            visited[i]--;
        }
        
        return answer;
    }
    
    private void dfs(int count, int sum, int pickIdx, int startMineralIdx, int[] picks, String[] minerals) {
        int add = 0;
        
        if(answer <= sum || startMineralIdx >= minerals.length) return;
        
        for(int i = startMineralIdx; i < startMineralIdx + 5; i++) { 
            if (i >= minerals.length) break;
            
            String mineral = minerals[i];
            
            if(pickIdx == 0) {
                add++;
            } else if(pickIdx == 1) {
                add += mineral.equals("diamond") ? 5 : 1;
            } else {
                if(mineral.equals("diamond")) add += 25;
                else {
                    add += mineral.equals("iron") ? 5 : 1;
                }
            }
        }
        
        if(count >= total || startMineralIdx + 5 >= minerals.length)  {
            answer = Math.min(answer, sum + add);
            return;
        }
        
        for(int i = 0; i < picks.length; i ++) {
            if(picks[i] == 0 || picks[i] == visited[i]) continue;
            
            visited[i]++;
            dfs(count + 1, sum + add, i, startMineralIdx + 5, picks, minerals);
            visited[i]--;
        }
    }
}