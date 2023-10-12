import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String str = sc.nextLine();
    
    for(char c : str.toCharArray()) {
      if(c == ')') {
        if(stack.isEmpty()) {
          System.out.println("NO");
          return;
        }
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    if(!stack.isEmpty()) {
          System.out.println("NO");
          return;
    }
    System.out.println("YES");
           
    return;
  }
}
