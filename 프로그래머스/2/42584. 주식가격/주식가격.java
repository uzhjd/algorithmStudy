class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len - 1; i++) {
            int time = 0;
            boolean flag = false;
            
            for(int j = i + 1; j < len; j++) {
                time++;
                if(prices[i] > prices[j]) {
                    answer[i] = time;
                    flag = true;
                    break;
                }
            }
            if(!flag) answer[i] = time;
        }

        answer[len - 1] = 0;
        return answer;
    }
}