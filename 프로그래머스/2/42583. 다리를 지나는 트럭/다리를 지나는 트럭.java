import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();
        int w = 0; // 다리 위 트럭 총 무게
        int time = 0; // 경과 시간
        int idx = 0; // 다음에 진입할 트럭 인덱스
        
        // 다리를 처음엔 비워둠 (길이만큼 0을 채움)
        for (int i = 0; i < bridge_length; i++) {
            que.add(0);
        }

        while (!que.isEmpty()) {
            time++;
            // 다리에서 나가는 트럭 무게를 빼줌
            w -= que.poll();

            // 다음 트럭을 올릴 수 있는지 확인
            if (idx < truck_weights.length) {
                if (w + truck_weights[idx] <= weight) {
                    que.add(truck_weights[idx]); // 트럭 진입
                    w += truck_weights[idx]; // 현재 무게 갱신
                    idx++;
                } else {
                    que.add(0); // 트럭을 못 올리면 빈 공간 추가
                }
            }
        }

        return time;
    }
}
