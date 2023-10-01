import java.util.Scanner;
  
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine().toLowerCase();
    StringBuffer sb = new StringBuffer(str);
    String reverse = sb.reverse().toString();
    
    if(str.equals(reverse))
    	System.out.println("YES");
    else
    	System.out.println("NO");
      
    return ;
  }
}
