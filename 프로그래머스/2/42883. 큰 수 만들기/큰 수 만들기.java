import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;
        
        for(int i = 0; i < number.length(); i++) {
            while(k > 0 && sb.length() > 0 && number.charAt(i) > sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            
            sb.append(number.charAt(i));
        }
        
        return sb.substring(0, len).toString();
        // return sb.toString();
    }
}