import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
                continue;
            }
            
            stack.add(c);
        }

        if(stack.isEmpty()) return true;
        return false;
    }
}