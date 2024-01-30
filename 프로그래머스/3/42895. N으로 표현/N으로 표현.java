import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<HashSet<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < 9; i++) {
            list.add(new HashSet<Integer>());
        }
        
        list.get(1).add(N);
        if(N == number) return 1;
        
        for(int i = 2; i < 9; i++) {
            HashSet<Integer> result = list.get(i);
            
            for(int j = 1; j < i; j++) {
                
                HashSet<Integer> a = list.get(j);
                HashSet<Integer> b = list.get(i - j);
                
                for(int x : a) {
                    for(int y : b) {
                        result.add(x + y);
                        result.add(x - y);
                        result.add(x * y);
                        if(x != 0 && y != 0)
                            result.add(x / y);
                    }
                }
                result.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            }
            
            if(result.contains(number)) return i;
        }
        
        return -1;
    }
}