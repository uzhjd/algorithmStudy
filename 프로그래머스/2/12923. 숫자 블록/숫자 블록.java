import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static int[] solution(long begin, long end) {
        int first = (int) begin;
        int last = (int) end;
        int[] answer = new int[last - first + 1];
        
        for(int i = first, idx = 0; i <= last; i++) {
            answer[idx++] = getBlock(i);
        }

        return answer;
    }


    private static int getBlock(int n) {
        List<Integer> list = new ArrayList<>();
        if(n == 1) return 0;
        
        for(int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if(n % i == 0) {
                list.add(i);
                if(n/i <= 10_000_000)
                    return n/i;
            }
        }
        
        if(!list.isEmpty()) return list.get(list.size() - 1);
        
        return 1;
    }

}