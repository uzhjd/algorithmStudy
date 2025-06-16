import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        if(N > set.size()) return set.size();
        else return N;
    }
}