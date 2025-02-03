import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int n = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        
        set.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(answer >= n) break;
            int num = nums[i];
            if(set.contains(num)) continue;
            
            set.add(num);
            answer++;
        }
		
		return answer;
    }
}