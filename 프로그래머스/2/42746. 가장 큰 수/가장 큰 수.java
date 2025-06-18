import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] str = new String[len];
        
        for(int i = 0; i < len; i++)
            str[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(str, new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                int o1 = Integer.parseInt(s1 + s2);
                int o2 = Integer.parseInt(s2 + s1);
                return o2 - o1;
            }
        });
        
        
        String answer = "";
        for(String s : str) answer += s;
        
        if(answer.charAt(0) == '0') return "0";
        
        return answer;
    }
}