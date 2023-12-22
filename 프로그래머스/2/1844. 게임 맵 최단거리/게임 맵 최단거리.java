import java.util.*;

class Solution {
    
    public int BFS (int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];
            
            if(cx == maps.length - 1 && cy == maps[0].length - 1) {
                return visited[cx][cy];
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    q.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[cx][cy] + 1;
                }
            }
        }
        
        return -1;
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        
        
        return BFS(maps);
    }
}