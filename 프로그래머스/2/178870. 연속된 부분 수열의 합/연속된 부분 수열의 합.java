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
                if(++right < sequence.length)
                    sum += sequence[right];
            } else if(sum == k) {
                if(length > right - left) {
                System.out.print(left + " " + right + "\n");
                    length = right - left;
                    aL = left;
                    aR = right;
                }
                sum -= sequence[left++];
            } else {
                sum -= sequence[left++];
            }
        }
        
        return new int[] {aL, aR};
    }
}