import java.util.*;
  
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int n = sc.nextInt();
    int[][] board = new int[n][n];
    int cnt = 0;
    
    for(int i = 0; i < n; i ++) {
      for(int j = 0; j < n; j ++) {
        board[i][j] = sc.nextInt();
      }
    }
    
    int m = sc.nextInt();
    
    int[] moves = new int[m];
    for(int i = 0; i < m; i++) {
      moves[i] = sc.nextInt();
    }
    
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        int t = board[j][moves[i] - 1];
        board[j][moves[i] - 1] = 0;
        
        if(t != 0) {
          if(stack.isEmpty()) {
            stack.push(t);
          } else if(stack.peek() == t) {
            stack.pop();
            cnt += 2;
          } else {
            stack.push(t);
          }
          
          break;
        }
      }
    }
      
    System.out.print(cnt);
    
    return ;
  }
}
