class Solution {
    public int solution(int n) {
        int answer = n;
        int cnt = Integer.bitCount(n);
        
        while(true) {
            if(Integer.bitCount(++answer) == cnt) break;
        }
        
        return answer;
    }
}