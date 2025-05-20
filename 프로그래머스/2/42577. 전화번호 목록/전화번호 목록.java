import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        
        for(String str : phone_book) {
            set.add(str);
        }
        
        for(String str : phone_book) {
            int n = str.length();
            
            for(int i = 1; i < n; i++) {
                if(set.contains(str.substring(0, i))) return false;
            }
        }
        
        return true;
    }
}