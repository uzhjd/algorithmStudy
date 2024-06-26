class Solution {
    
    static int answer = 0;
    static int len;
    
    public int solution(int[] numbers, int target) {
        len = numbers.length;
        
        dfs(0, target, numbers, numbers);
        
        return answer;
    }
    
    public void dfs(int L, int target, int[] numbers, int[] tmp) {
        if(L == len) {
            int sum = 0;
            
            for(int n : tmp) {
                sum += n;
            }
            if(sum == target) {
                answer++;
            }
            return;
        }
        
        
        dfs(L + 1, target, numbers, tmp);
        tmp[L] *= (-1);
        dfs(L + 1, target, numbers, tmp);
    }
}