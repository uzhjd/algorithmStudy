class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int next = 0;
        
        for(int i = 0; i < number.length() - k; i++) {
            int max = 0;
            
            for(int j = start; j <= i + k; j++) {
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    next = j;
                }
            }
            
            sb.append(max);
            start = next + 1;
        }
        
        return sb.toString();
    }
}