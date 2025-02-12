import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int len = people.length;
        int answer = 0;
        int L = 0;
        int R = len - 1;
        
        Arrays.sort(people);
        
        while(L <= R) {
            answer++;
            
            if(L == R) break;
            if(people[L] + people[R] <= limit) {
                L++;
                R--;
            } else {
                R--;
            }
        }
        
        return answer;
    }
}