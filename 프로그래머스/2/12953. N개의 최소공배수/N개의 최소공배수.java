import java.util.*;

class Solution {
    
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> tmp = new HashMap<>();
    
    public int solution(int[] arr) {
        int answer = 1;
        
        for(int i = 0; i < arr.length; i++) {
            dis(arr[i]);
            // System.out.println(arr[i]);
            // for(Integer n : tmp.keySet())
            //     System.out.print(n + " X " + tmp.get(n) + "\n");
            gcd();
            tmp.clear();
        }
        
        for(int n : map.keySet()) {
            // System.out.print(n + "  " +map.get(n) + "\n");
            System.out.println( Math.pow(n, map.get(n)));
            answer *= Math.pow(n, map.get(n));
        }
        
        return answer;
    }
    
    private void dis(int n) {
        if(n == 1) return;
        
        for(int i = 2; i <= n; i ++) {
            if(n % i == 0) {
                tmp.put(i, tmp.getOrDefault(i, 0) + 1);
                dis(n/i);
                break;
            }
        }
    } 
    
    private void gcd() {
        for(int n : tmp.keySet()) {
            int t = tmp.get(n);
//             System.out.print(n + " ");
//             System.out.println(t);
            
            if(map.getOrDefault(n, 0) < t) {
                map.put(n, t);
            }
        }
        System.out.println();
    }
}