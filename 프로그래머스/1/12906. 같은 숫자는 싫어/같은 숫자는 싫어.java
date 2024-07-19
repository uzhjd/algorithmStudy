import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int n = arr[i];
            
            if(stack.peek() != n) {
                stack.push(n);
            }
        }
        
        int[] answer = new int[stack.size()];
        int len = stack.size() - 1;
        for(int i = len; i > -1; i--) 
            answer[i] = stack.pop();
        
        return answer;
    }
}