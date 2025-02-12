import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;
        
        for(int i = 0; i < number.length(); i++) {
            Character c = number.charAt(i);
            while(k > 0 && sb.length() > 0 && c > sb.charAt(sb.length() - 1)) {
                k--;
                sb.deleteCharAt(sb.length()-1);
            }
            
            sb.append(c);
        }
        
        return sb.substring(0, len).toString();
    }
}