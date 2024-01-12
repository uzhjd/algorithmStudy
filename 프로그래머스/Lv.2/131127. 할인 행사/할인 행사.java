import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> dmap = new HashMap<>();
            answer++;
            
            for(int j = 0; j < 10; j++) {
                dmap.put(discount[i + j], dmap.getOrDefault((discount[i + j]), 0) + 1);
            }
            
            for(String str : dmap.keySet()) {
                if(map.get(str) != dmap.get(str)) {
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}