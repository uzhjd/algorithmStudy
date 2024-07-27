class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void DFS(int[] numbers, int target, int result, int n) {
        if(n == numbers.length) {
            if(result == target) {
                answer++;
            }
            return;
        }
        
        int num = numbers[n];
        DFS(numbers, target, result + num, n + 1);
        DFS(numbers, target, result - num, n + 1);
    }
}