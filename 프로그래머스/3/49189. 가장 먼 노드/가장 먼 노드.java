import java.util.*;

class Solution {
    
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    
    public int solution(int n, int[][] edge) {
        
        for(int i = 0; i <= n ; i++) {
            arr.add(new ArrayList<>());
        }
        
        for(int[] e : edge) {
            int a = e[0];
            int b = e[1];
            
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        
        return BFS();
    }
    
    public int BFS() {
        int len = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        set.add(1);
        
        while(!q.isEmpty()) {
            len = q.size();
            
            for(int i = 0; i < len; i++) {
                int n = q.poll();
                
                for(int tmp : arr.get(n)) {
                    if(!set.contains(tmp)) {
                        q.add(tmp);
                        set.add(tmp);
                    }
                }
            }
        }
        
        return len;
    }
}