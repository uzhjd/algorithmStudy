import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      str = str.toUpperCase();
      
      for(int i = 0; i < str.length() / 2; i++) {
      	if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
          System.out.println("NO");
          return;
        }
      }	
      System.out.println("YES");
      return ;
    }
}
