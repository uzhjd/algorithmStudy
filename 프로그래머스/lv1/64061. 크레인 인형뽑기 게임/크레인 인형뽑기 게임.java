import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int pick;
        Stack<Integer> bucket = new Stack();

        for(int i=0; i < moves.length; i++) {
            pick = moves[i] - 1;
            for(int j=0; j<board.length; j++) {
                if(board[j][pick] != 0) {

                    if((!bucket.empty()) && (board[j][pick] == bucket.peek())) {
                        bucket.pop();
                        answer+=2;
                        board[j][pick] = 0;
                        break;
                    }
                    bucket.push(board[j][pick]);
                    board[j][pick] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}