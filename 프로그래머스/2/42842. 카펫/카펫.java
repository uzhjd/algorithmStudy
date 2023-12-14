class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i = 3; i < total; i++) {
            int w = i;
            int h = total / i;
            
            if(w > h) continue;
            
            if((w - 2) * (h - 2) == yellow) {
                answer[0] = h;
                answer[1] = w;
                break;
            }
        }
        
        return answer;
    }
}