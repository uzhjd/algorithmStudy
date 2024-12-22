import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        
       for (Integer value : map.values()) {
            answer *= value +1;
        }
        
        // Iterator<Integer> it = map.values().iterator();
        // while(it.hasNext()) {
        //     answer *= it.next().intValue() + 1;
        // }
        
        return answer - 1;
    }
}