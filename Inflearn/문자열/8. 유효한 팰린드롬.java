import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        String sb = new StringBuilder(str).reverse().toString();

        if(str.equals(sb)) System.out.println("YES");
        else System.out.println("NO");

        return ;
    }
}
