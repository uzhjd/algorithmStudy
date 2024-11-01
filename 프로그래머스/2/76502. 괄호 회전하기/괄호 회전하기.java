import java.util.*;

class Solution {
    
    public int solution(String s) {
        int answer = 0;
           
        if(isCorrect(s)) answer++;
        for(int i = 1; i < s.length(); i++) {
            if(rotate(i, s)) answer++;    
        }
        
        return answer;
    }
    
    private boolean rotate(int idx, String s) {
        String roStr = s.substring(idx, s.length()) + s.substring(0, idx);
        
        if(isCorrect(roStr)) return true;
        return false;
    }
    
    private boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.add(c);
                continue;
            }
            
            char st = ' ';
            if(!stack.isEmpty()) {
                st = stack.pop();
            }
            
            if(st == ' ')return false;
            if(st == '(') if(c != ')') return false;
            if(st == '{') if(c != '}') return false;
            if(st == '[') if(c != ']') return false;
        }
        
        if(!stack.isEmpty()) return false;
        else return true;
    }
}