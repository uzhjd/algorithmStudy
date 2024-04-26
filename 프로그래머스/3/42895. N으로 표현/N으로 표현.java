import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<HashSet<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < 9; i ++)
            list.add(new HashSet<Integer>());
        
        list.get(1).add(N);
        if(N == number) return 1;
        
        for(int i = 2; i < 9; i++) {
            HashSet<Integer> now = list.get(i);
            
            for(int j = 1; j < i; j++) {
                HashSet<Integer> a = list.get(j);
                HashSet<Integer> b = list.get(i - j);
                
                for(int x : a) {
                    for(int y : b) {
                        now.add(x + y);
                        now.add(x - y);
                        now.add(x * y);
                        if(x != 0 && y != 0)
                            now.add(x / y);
                    }
                }
            }

            now.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            if(now.contains(number)) return i;
        }
        
        
        return -1;
    }
}