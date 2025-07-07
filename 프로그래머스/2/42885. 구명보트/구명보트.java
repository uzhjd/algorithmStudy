import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int L = 0;
        int R = people.length - 1;
        int answer = 0;
        
        while(L <= R) {
            if(people[L] + people[R] <= limit) {
                L++;
                R--;
            } else R--;
            answer++;
        }
        
        return answer;
    }
}