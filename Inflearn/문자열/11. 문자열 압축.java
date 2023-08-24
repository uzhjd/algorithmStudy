import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str = sc.nextLine();
       char c = str.charAt(0);
       int cnt = 1;

       for(int i = 1; i < str.length(); i++) {
           if(str.charAt(i) == c) {
               cnt++;
           }
           else {
               if(cnt == 1) System.out.print(c);
               else {
                   System.out.print(c);
                   System.out.print(cnt);
               }

               c = str.charAt(i);
               cnt = 1;
           }
       }

        if(cnt == 1) System.out.print(c);
        else {
            System.out.print(c);
            System.out.print(cnt);
        }

        return ;
    }
}
