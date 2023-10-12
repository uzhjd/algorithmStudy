import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Queue<Integer> que = new LinkedList<>();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int answer = 0;
    
    for(int i = 0; i < n; i++) {
      que.add(i + 1);
    }
    
    while(!que.isEmpty()) {
      for(int i = 0; i < k - 1; i++) {
        que.add(que.poll());
      }
      answer = que.poll();
    }
    
    System.out.println(answer);
    return ;
  }
}
