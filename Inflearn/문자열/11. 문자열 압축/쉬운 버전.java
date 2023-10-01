import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    char c = str.charAt(0);
    String result = c + "";
    int cnt = 1;
    
    for(int i = 1; i < str.length(); i++) {
      if(str.charAt(i) != c) {
        if(cnt != 1)
	        result += cnt;
        
        cnt = 1;
        c = str.charAt(i);
        result += c;
      } else {
        cnt++;
      }
    }
    
    result += cnt;
    
    System.out.println(result);
    
    return ;
  }
}
