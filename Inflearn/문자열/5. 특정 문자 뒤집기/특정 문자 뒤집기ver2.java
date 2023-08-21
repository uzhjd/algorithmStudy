import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String reverse = "";
        int j = 0;
        String result = "";

        for(int i = str.length() - 1; i > -1; i--) {
            if(Character.isAlphabetic(str.charAt(i))) reverse += str.charAt(i);
        }

        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) result += reverse.charAt(j++);
            else result += str.charAt(i);
        }

        System.out.println(result);

        return ;
    }
}
