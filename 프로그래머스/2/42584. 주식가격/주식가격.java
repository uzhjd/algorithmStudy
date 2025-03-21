class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len - 1; i++) {
            int n = prices[i];
            int cnt = 0;
            
            for(int j = i + 1; j < len; j++) {
                cnt++;
                if(n > prices[j]) {
                    answer[i] = cnt;
                    break;
                }
                else if(j == len-1) answer[i] = cnt;
            }
        }
        
        return answer;
    }
}