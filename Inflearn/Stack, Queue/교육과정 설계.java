import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Queue<Character> que = new LinkedList<>();
    
    String es = sc.nextLine();
    String str = sc.nextLine();
    
    for(int i = 0; i < es.length(); i++) {
      que.add(es.charAt(i));
    }
    
    for(char c : str.toCharArray()) {
       if(!que.isEmpty() && c == que.peek()) {
         que.poll();
         if(que.contains(c)) {
           System.out.println("NO");
           return;
         }
       }
    }
    
    if(que.isEmpty())
	    System.out.println("YES");
    else
      System.out.println("NO");
    
    return ;
  }
}
