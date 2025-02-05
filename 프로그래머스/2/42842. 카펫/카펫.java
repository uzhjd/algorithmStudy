class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        
        if(yellow == 1) {
            answer[0] = 3;
            answer[1] = 3;
            
            return answer;
        }
        int half = yellow / 2;
        for(int i = 1; i <= half; i++) {
            if(yellow % i != 0) continue;
            int w = yellow / i;
            
            if((w + 2)*2 + (i +2)*2 - 4 == brown) {
                answer[0] = w + 2;
                answer[1] = i + 2;
                break;
            }
        }
        
        return answer;
    }
}