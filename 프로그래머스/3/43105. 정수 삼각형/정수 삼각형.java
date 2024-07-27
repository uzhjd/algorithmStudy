class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int h = triangle.length;
        int[][] tmp = new int[h][h];
        tmp[0][0] = triangle[0][0];
        
        for(int i = 0; i < h-1; i++) {
            int w = triangle[i].length;
            
            for(int j = 0; j < w; j++) {
                tmp[i+1][j] = Math.max(triangle[i+1][j] + tmp[i][j], tmp[i+1][j]);
                tmp[i+1][j+1] = triangle[i+1][j+1] + tmp[i][j];
            }
        }
        
        for(int n : tmp[h-1]) {
            answer = Math.max(n, answer);
        }
        
        return answer;
    }
}