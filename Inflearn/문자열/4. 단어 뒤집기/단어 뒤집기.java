import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(sc.nextLine());
            
            System.out.println(sb.reverse().toString());
        }

        return ;
    }
}
