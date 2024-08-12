import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;  // 최종 문자열의 길이
        for (int i = 0; i < number.length(); i++) {
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < number.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(number.charAt(i));
        }
        return sb.substring(0, len).toString();  // len 만큼 잘라서 반환
    }
}