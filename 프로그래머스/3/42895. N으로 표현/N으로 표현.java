import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<Set<Integer>> list = new LinkedList<>();
        
        for(int i = 0; i < 9; i++) {
            list.add(new HashSet<>());
        }
        
        list.get(1).add(N);
        for(int i = 2; i < 9; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < i; j++)
                sb.append(N);
            list.get(i).add(Integer.parseInt(sb.toString()));
            
            for(int j = 1; j < i; j++) {
                int k = i - j;
                for(int n1 : list.get(j)) {
                    for(int n2 : list.get(k)) {
                        list.get(i).add(n1 + n2);
                        list.get(i).add(n1 - n2);
                        list.get(i).add(n1 * n2);
                        if(n2 != 0)
                            list.get(i).add(n1 / n2);
                    }
                }
            }
        }
        
         for(int i = 1; i < 9; i++) {
            if(list.get(i).contains(number))
                return i;
        }
        
        return -1;
    }
}