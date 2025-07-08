import java.util.*;

class Solution {
    ArrayList<ArrayList<Integer>> list;
    int[] count;
        
    public int solution(int n, int[][] edge) {
        list = new ArrayList<>();
        count = new int[n + 1];
        int answer = 0;
        
        for(int i = 0; i <= n; i++)
            list.add(new ArrayList<>());
        
        for(int[] e : edge) {
            int a = e[0];
            int b = e[1];
            
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        int max = BFS(n);
        
        for(int i = 2; i <= n; i++){
            System.out.println(i);
            if(count[i] == max) answer++;
        }
        
        return answer;
    }
    
    public int BFS(int n) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1); // node, distance
        int depth = 0;
        int max = 0;
            
        while(!que.isEmpty()) {
            depth++;
            int len = que.size();
            
            for(int i = 0; i < len; i++) {
                
                int idx = que.poll();
                for(int t : list.get(idx)) {
                    if(count[t] == 0) {
                        count[t] = depth;
                        que.add(t);
                        max = Math.max(depth, max);
                    }
                }
            }
        }
        return max;
    }
    
}