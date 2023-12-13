class Solution {
    public int[] solution(int[] sequence, int k) {
        
        int left = 0;
        int right = -1;
        int sum = 0;
        int length = 1000001;
        int aL = -1;
        int aR = -1;
        
        
        while(right < sequence.length) {
            if(sum < k) {
                 if (++right < sequence.length)
                    sum += sequence[right];
            } else if(sum > k) {
                sum -= sequence[left++];
            } else {
                if(length > (right - left)) {
                    length = right - left;
                    aL = left;
                    aR = right;
                }
                sum -= sequence[left++];
            }
        }
        
        return new int[] {aL, aR};
    }
}