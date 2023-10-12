import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    String str = sc.nextLine();
    int answer = 0;
    
    for(char c : str.toCharArray()) {
      if(Character.isDigit(c)) {
        stack.push(c - '0');
      } else {
        int rt = stack.pop();
        int lt = stack.pop();
        
        if(c == '+') stack.push(lt + rt);
        else if (c == '-') stack.push(lt - rt);
        else if (c == '*') stack.push(lt * rt);
        else if (c == '/') stack.push(lt / rt);
      }
    }
    
    System.out.println(stack.get(0));
    return;
  }
}
