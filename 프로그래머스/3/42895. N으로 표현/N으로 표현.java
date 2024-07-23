import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i = 0; i < 9; i++)
            dp.add(new HashSet<>());
        
        dp.get(1).add(N);
        for(int i = 2; i < 9; i++) {
            StringBuilder sb = new StringBuilder();
            for(int n = 0; n < i; n++)
                sb.append(N);
            dp.get(i).add(Integer.parseInt(sb.toString()));
            
            for(int j = 1; j < i; j++) {
                int k = i - j;
                
                for(int n1 : dp.get(j)) {
                    for(int n2 : dp.get(k)) {
                        dp.get(i).add(n1 + n2);
                        dp.get(i).add(n1 - n2);
                        dp.get(i).add(n1 * n2);
                        if(n2 != 0)
                            dp.get(i).add(n1 / n2);
                    }
                }
            }
        }
        
        for(int i = 1; i < 9; i++) {
            if(dp.get(i).contains(number))
                return i;
        }
        
        return -1;
    }
}