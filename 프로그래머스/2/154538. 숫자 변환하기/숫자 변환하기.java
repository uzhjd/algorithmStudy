import java.util.*;

class Solution {
    static boolean[] visited = new boolean[1000001];
    
    public int solution(int x, int y, int n) {
        
        return BFS(x,y,n);
    }
    
    int BFS(int x, int y, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, 0});
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            
            if(now[0] == y) return now[1];
            
            if(now[0] + n <= y && !visited[now[0] + n]) {
                q.add(new int[]{now[0] + n, now[1] + 1});
                visited[now[0] + n] = true;
            } 
            if(now[0] * 2 <= y && !visited[now[0] * 2]) {
                q.add(new int[]{now[0] * 2, now[1] + 1});
                visited[now[0] * 2] = true;
            }
            if(now[0] * 3 <= y && !visited[now[0] * 3]) {
                q.add(new int[]{now[0] * 3, now[1] + 1});
                visited[now[0] * 3] = true;
            }
        }
        
        return -1;
        
    }
}