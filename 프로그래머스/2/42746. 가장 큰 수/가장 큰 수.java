import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int n = numbers.length;
        String[] str = new String[n];
        String answer = "";
        
        for(int i = 0; i < n; i++) {
            str[i] = numbers[i] + "";
        }
        
        Arrays.sort(str, new Comparator<> () {
            @Override
            public int compare(String s1, String s2) {
                int o1 = Integer.parseInt(s2 + s1);
                int o2 = Integer.parseInt(s1 + s2);
                return o1 - o2;
            }
        });
        
        for(int i = 0; i < n; i++) {
            answer += str[i];
        }
        
        if(answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}