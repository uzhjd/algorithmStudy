import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int len = str.length;
        int[] arr = new int[len];
        
        for(int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        String answer = arr[0] + " ";
        answer += arr[len - 1];
        
        return answer;
    }
}