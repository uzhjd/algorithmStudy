class Solution {
    static int answer = 0;
    
    public void DFS(int[] numbers, int target, int l, int sum) {
        if(l == numbers.length){
            if(sum == target) {
                answer++;
            }
        } else {
            DFS(numbers, target, l + 1, sum + numbers[l]);
            DFS(numbers, target, l + 1, sum - numbers[l]);
        }
        
        return;
    }
    
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        
        return answer;
    }
}