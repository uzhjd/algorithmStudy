import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++)
            num[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(num, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        for(int i = 0; i < numbers.length; i++)
            answer += num[i];
        
        if(answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}