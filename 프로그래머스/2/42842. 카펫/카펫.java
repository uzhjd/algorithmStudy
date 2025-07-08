class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
             
        if(yellow == 1) {
            answer[0] = 3;
            answer[1] = 3;
        }
        int half = yellow/2;
        for(int i = 1; i <= half; i++) {
            if(yellow % i != 0) continue;
            
            if((yellow/i + 2) * (i + 2) == brown + yellow) {
                int a = yellow/i + 2;
                int b = i + 2;
                answer[0] = Math.max(a, b);
                answer[1] = Math.min(a, b);
            }
        }
        
        return answer;
    }
}