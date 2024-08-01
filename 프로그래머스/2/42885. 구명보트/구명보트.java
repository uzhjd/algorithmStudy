import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int L = 0;
        int R = people.length - 1;
        
        Arrays.sort(people);
        
        while(L <= R) {
            if(people[R] + people[L] <= limit) L++;
            
            R--;
            answer++;
        }
        
        return answer;
    }
}