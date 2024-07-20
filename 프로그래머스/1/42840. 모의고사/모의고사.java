class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = {0, 0, 0};
        int[] a = {1, 2, 3, 4, 5}; // 5
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i % 5]) cnt[0]++;
            if(answers[i] == b[i % 8]) cnt[1]++;
            if(answers[i] == c[i % 10]) cnt[2]++;
        }
        
        int max = Integer.MIN_VALUE;
        int n = 1;
        for(int i = 0; i < 3; i++) {
            if(max == cnt[i]) n++;
            max = Math.max(max, cnt[i]);
        }
        System.out. println(max);
        int[] answer = new int[n];
        n = 0;
        for(int i = 0; i < 3; i ++)
             if(cnt[i] == max) answer[n++] = i + 1;
        
        return answer;
    }
}