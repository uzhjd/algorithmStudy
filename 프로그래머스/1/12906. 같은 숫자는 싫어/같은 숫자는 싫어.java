import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int n = arr[i];
            if(stack.peek() == n) continue;
            stack.add(n);
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        for(int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}