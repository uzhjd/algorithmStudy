import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        
        for(String str : phone_book) {
            set.add(str);
        }
        
        for(int i = 0; i < phone_book.length; i++) {
            int end = phone_book[i].length();
            
            for(int j = 1; j < end; j++) {
                if(set.contains(phone_book[i].substring(0, j))){
                    System.out.println(phone_book[i].substring(0, j));
                    return false;
                }
            }
        }
        
        return true;
    }
}