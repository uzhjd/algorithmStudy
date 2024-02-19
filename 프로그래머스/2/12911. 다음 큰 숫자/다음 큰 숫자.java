class Solution {
    public int solution(int n) {
        int answer = n;
        int nCnt = Integer.bitCount(n);
        
        while(true) {
            if(Integer.bitCount(++answer) == nCnt) return answer;
        }
        
        
    }
}