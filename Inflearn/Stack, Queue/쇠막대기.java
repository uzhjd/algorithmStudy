import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    int answer = 0;
    
    String str = sc.nextLine();
    
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == '(') {
        stack.push('(');
      } else {
        stack.pop();
        
        if(str.charAt(i - 1) == '(') { // ray
          answer += stack.size();
        } else {
          answer += 1;
        }
      }
    }
    
    System.out.println(answer);
    return ;
  }
}
