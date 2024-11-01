import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++) {
            int n = tangerine[i];
            map.put(n, (map.getOrDefault(n, 0) + 1));
        }
        
        List<Integer> keySet = new LinkedList<>(map.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        
        for(int n : keySet) {
            k -= map.get(n);
            answer++;
            
            if(k <= 0) break;
        }
        
        return answer;
    }
}