import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] task = new int[len];
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            task[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
        }
        
        stack.push(task[0]);
        int cnt = 0;
        for(int n : task) {
            if(stack.peek() >= n) cnt++;
            else {
                stack.push(n);
                que.add(cnt);
                cnt = 1;
            }
        }
        
        que.add(cnt);
        int[] answer = new int[que.size()];
        int idx = 0;
        while(!que.isEmpty()) answer[idx++] = que.poll();
        return answer;
    }
}