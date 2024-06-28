class Solution {
    
    static int answer = 0;
    static int len;
    
    public int solution(int[] numbers, int target) {
        len = numbers.length;
        
        dfs(0, target, 0, numbers);
        
        return answer;
    }
    
    public void dfs(int L, int target, int sum, int[] numbers) {
        if(L == len) {
            if(sum == target) {
                answer++;
            }
            return;
        }
        
        
        dfs(L + 1, target, sum + numbers[L], numbers);
        dfs(L + 1, target, sum - numbers[L], numbers);
    }
}