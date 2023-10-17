class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i = 3; i < total; i ++) {
            int h = i;
            int w = total / i;
            
            if(w < h) continue;
            
            if((w - 2) * (h - 2) == yellow) {
                answer[0] = w;
                answer[1] = h;
                
                return answer;
            }
        }
        return answer;
    }
}