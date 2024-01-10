import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
            
            while(!st.isEmpty() && numbers[i] > numbers[st.peek()]) {
                answer[st.pop()] = numbers[i];
            }
            st.add(i);
        }
        
        return answer;
    }
}