```java
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    int answer = 1;
    
    for(int i = 3; i <= n; i++) {
      boolean flag = false;
      for(int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
        if(i % j == 0) {
          flag = true;
          break;
        }
      }
      if(!flag) answer++;
    }
    
    System.out.println(answer);
    return ;
  }
}
```
