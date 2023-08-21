import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    int lt = 0, rt = str.length() - 1;
    char[] s = str.toCharArray();
    String answer = "";
    
    while(lt < rt) {
      if(!Character.isAlphabetic(s[lt])) {
        lt++;
      }
      else if(!Character.isAlphabetic(s[rt])) {
        rt--;
      }
      else {
        char tmp = s[lt];
    	s[lt] = s[rt];
        s[rt] = tmp;
        
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(s);
    System.out.println(answer);
    
    return ;
  }
}
