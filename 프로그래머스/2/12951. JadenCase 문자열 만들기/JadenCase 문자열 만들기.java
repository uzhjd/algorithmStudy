class Solution {
    public String solution(String s) {
        String answer = "";
        boolean check = false;
        
        for(char c : s.toCharArray()) {
            
            if(c == ' ') {
                check = false;
                answer += ' ';
            }
            else if(!check) {
                answer += Character.toUpperCase(c);
                check = true;
            } else {
                answer += Character.toLowerCase(c);
            }
            
        }
        
        return answer;
    }
}