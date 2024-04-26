```java
  import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    int[] arr = new int[n];
    
    arr[0] = 1;
    arr[1] = 1;
    
    for(int i = 2; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    
    for(int num : arr) 
	    System.out.print(num + " ");
    return ;
  }
}
```
