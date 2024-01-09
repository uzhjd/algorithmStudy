import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> list = new LinkedList<String>();
        int answer = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(String str : cities) {
            str = str.toLowerCase();
            
            if(list.isEmpty()) {
                list.add(str);
                answer = 5;
            }
            
            else {
                if(list.contains(str)) {
                    answer++;
                    list.remove(str);
                } else {
                    answer += 5;
                    
                    if(list.size() >= cacheSize) {
                        list.remove(0);
                    }
                }
                
                list.add(str);
            }
        }
        
        return answer;
    }
}