import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = Integer.parseInt(sc.nextLine());
       String str = sc.nextLine();

       for(int i = 0; i < n; i++) {
           int cnt = 0;

           for(int j = 0; j < 7; j++) {
               if(str.charAt(i * 7 + j) == '#') {
                   cnt += Math.pow(2, 6 - j);
               }
           }
           System.out.print((char)cnt);
       }

        return ;
    }
}
