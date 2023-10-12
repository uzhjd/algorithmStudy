import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Stack<Character> stack = new Stack<>();
    String answer = "";
    
    for(char c : str.toCharArray()) {
     
      if (c == '(') {
        stack.push(c);	
      } else if(c == ')') {
        stack.pop();
      } else if(stack.isEmpty()) {
        answer += c;
      }   
    }
    
      System.out.println(answer);
    
  }
}
