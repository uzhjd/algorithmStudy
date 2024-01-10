import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(st.isEmpty()) {
                st.add(c);
            } else {
                if(st.peek() == c) {
                    st.pop();
                } else {
                    st.add(c);
                }
            }
        }

        if(st.isEmpty()) return 1;
        else return 0;
    }
}