class Solution {
    int answer = 0;
    static boolean[] visit;
    
    public void DFS(String[] words, String now, String target, int cnt) {
        if(now.equals(target)) {
            answer = cnt;
            return;
        }
        
        for(int i = 0; i < words.length; i++) {
            
            if(visit[i] == true)
                continue;
            
            
            int k = 0;
            for(int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) != now.charAt(j))
                    k++;
            }
            
            if(k == 1) {
                visit[i] = true;
                DFS(words, words[i], target, cnt + 1);
                visit[i] = false;
            }
        }
        
    }
    
    
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        
        DFS(words, begin, target, 0);
        
        return answer;
    }
}