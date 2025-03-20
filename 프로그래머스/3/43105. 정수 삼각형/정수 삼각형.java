class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        int w = triangle[h-1].length;
        int[][] board = new int[h][w];
        
        board[0][0] = triangle[0][0];
        for(int i = 0; i < h-1; i++) {
            for(int j = 0; j < i + 1; j++) {
                int t1 = board[i][j] + triangle[i + 1][j];
                if(board[i + 1][j] != 0) t1 = Math.max(board[i + 1][j], t1);
                board[i + 1][j] = t1;
                
                int t2 = board[i][j] + triangle[i + 1][j + 1];
                if(board[i + 1][j+1] != 0) t2 = Math.max(board[i + 1][j + 1], t2);
                board[i + 1][j + 1] = t2;
            }
        }
        
        // for(int i = 0; i < h; i++) {
        //     for(int j = 0; j < i+1; j ++) {
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int max = Integer.MIN_VALUE;
        for(int n : board[h-1])
            max = Math.max(max, n);
        
        return max;
    }
}