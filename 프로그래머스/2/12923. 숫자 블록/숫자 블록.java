import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static int[] solution(long begin, long end) {
        int first = (int)begin;
        int last = (int) end;
        int[] answer = new int[last - first + 1];

        for (int i = first,idx = 0; i <= last; i++) {
            answer[idx++] = getMaxDivisorExceptMe(i);
        }

        return answer;
    }


    private static int getMaxDivisorExceptMe(int x) {
        if (x == 1) {
            return 0;
        }

        List<Integer> l = new ArrayList<>();

        for (int i = 2; i <= Math.floor(Math.sqrt(x)); i++) {
            if (x % i == 0) {
                l.add(i);
                if (x / i <= 10_000_000) {
                    return x/i;
                }
            }

        }
        if (!l.isEmpty()) {
            return l.get(l.size() - 1);
        }

        return 1;
    }

}