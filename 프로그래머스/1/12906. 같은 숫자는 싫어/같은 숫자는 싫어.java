import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.add(arr[0]);
        for(int n : arr) {
            if(stack.peek() != (n)) {
                stack.add(n);
            }
        }
        
        int len = stack.size();
        int[] answer = new int[len];
        int cnt = len - 1;
        while(!stack.isEmpty()) answer[cnt--] = stack.pop();
        
        return answer;
    }
}