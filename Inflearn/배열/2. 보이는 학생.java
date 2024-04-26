```java
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    int[] arr = new int[n];
    int answer = 1;
    
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int tall = arr[0];
    
    for(int i = 1; i < n; i++) {
      if(arr[i] > tall) {
        answer++;
        tall = arr[i];
      }
    }
    
    System.out.println(answer);
    return ;
  }
}
```
