class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = -1;
        int sum = 0;
        int len = 1000001;
        
        while(right < sequence.length) {
            
            if(sum < k) {
                if(++right < sequence.length) {
                    sum += sequence[right];
                 }
            } else if (sum == k) {
                    if(len > right - left) {
                        answer[0] = left;
                        answer[1] = right;
                        len = right - left;
                    }
                    sum -= sequence[left++];
            } else {
                    sum -= sequence[left++];
            }
        }
        
        return answer;
    }
}