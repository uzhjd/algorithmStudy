import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(String s : phone_book) {
            set.add(s);
        }
        
        for(String s : phone_book) {            
            for(int j = 1; j < s.length(); j++) {
                
                if(set.contains(s.substring(0, j))) {
                    return false;
                }
            }
        }
            
        
        return true;
    }
}