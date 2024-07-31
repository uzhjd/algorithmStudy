class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        for(int i = 3; i < total / 2; i++) {
            if(total % i == 0) {
                int w = total / i;
                int h = i;
                
                if(2 * (w + h) - 4 == brown) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        
        return answer;
    }
}