import java.util.Scanner;

public class Main{
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    String answer = "";
    
    String[] arr = str.split(" ");
    
    for(String arr_ : arr) {
      if(answer.length() < arr_.length()) {
        answer = arr_;
      }
    }
    
    System.out.println(answer);
      
    return ;
  }
}
