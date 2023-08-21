import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";

        for(char c : str.toCharArray()) {
            if(result.indexOf(c) < 0) result += c;
        }
        System.out.println(result);

        return ;
    }
}
