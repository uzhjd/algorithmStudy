import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = 0;

    String a = sc.nextLine().toLowerCase();
    char b = sc.nextLine().toLowerCase().toCharArray()[0];

    for(char c : a.toCharArray()) {
      if(c == b)
        cnt++;
    }

    System.out.println(cnt);

    return;
  }
}