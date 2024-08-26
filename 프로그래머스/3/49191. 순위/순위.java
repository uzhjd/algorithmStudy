import java.util.*;

class Solution {
    
    int tmp = 0;
    boolean[] check;
    ArrayList<Integer>[] back;
    ArrayList<Integer>[] front;
    
    public int solution(int n, int[][] results) {
        int answer = 0;
        back = new ArrayList[n+1];
        front = new ArrayList[n+1];
        int[] result = new int[n+1];
        check = new boolean[n+1];
        
        for(int i = 0; i <= n; i++) {
            front[i] = (new ArrayList<>());
            back[i] = (new ArrayList<>());
        }
        
        for(int i = 0; i < results.length; i++) {
            int a = results[i][0];
            int b = results[i][1];
            
            front[b].add(a);
            back[a].add(b);
        }
        
        for(int i = 1; i <= n; i++) { // front
            tmp = 0;
            calc(i, front);
            result[i] = tmp;
            Arrays.fill(check, false);
        }    
        
        for(int i = 1; i <= n; i++) { // back
            tmp = 0;
            calc(i, back);
            result[i] += tmp;
            Arrays.fill(check, false);
        }    
        
        for(int i = 1; i <= n; i++)
            if(result[i] == n-1) answer++;
        
        return answer;
    }
    
    public void calc(int num, ArrayList<Integer>[] arr) {
        for(int n : arr[num]) {
            if(check[n]) continue;
            tmp++;
            check[n] = true;
            calc(n, arr);
        }
    }
}