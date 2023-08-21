import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        String result = "YES";

        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);

        return ;
    }
}
