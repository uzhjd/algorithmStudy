import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int moves = name.length() - 1;
        
        
        for(int i = 0; i < name.length(); i++) {
            // 상하
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            
            // 좌우
            int index = i + 1; // 구해야 할 것
            while(index < name.length() && name.charAt(index) == 'A') {
                index++;
            }
            
            // 지금까지의 이동 중 가장 짧은 거 vs i지점에서 꺽어서 뒤로 구하는 것
            moves = Math.min(moves, i * 2 + name.length() - index);
            // 꺽고 시작하는게 빠를 수도 있는 경우 체크 e.g.) BBBBBBAAAAAAAB
            moves = Math.min(moves, (name.length()-index)*2 + i);
        }
        
        return answer + moves;
    }
}