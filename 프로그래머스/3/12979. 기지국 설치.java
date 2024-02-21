class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int ai = 1;
        int si = 0;
        
        while(ai <= n) {
            if(si < stations.length && stations[si] - w <= ai) {
                ai = stations[si] + w + 1;
                si++;
            } else {
                answer++;
                ai += 2 * w + 1;
            }
        }

        return answer;
    }
}

/*
// 런타임 에러 문제

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        boolean[] apart = new boolean[n];
        int dis = 2 * w + 1;
        
        // 이전 기지국 설치 완료!
        for(int i = 0; i < stations.length; i++) {
            int start = stations[i] - w;
            
            for(int j = start; j < start + dis; j++) {
                if(j < 0) continue;
                if(j > n) break;
                
                apart[j-1] = true;
            }
        }
        
        int idx = 0;
        while(idx < n) {
            if(!apart[idx]) {
                answer++;
                idx += dis;
            } else {
                idx++;
            }
        }

        return answer;
    }
}
*/
