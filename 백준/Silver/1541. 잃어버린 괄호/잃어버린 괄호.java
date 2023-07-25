import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;
        String[] splitM = str.split("-");

        for(int i = 0; i < splitM.length; i++){
            int tmp = 0;
            String[] splitP = splitM[i].split("\\+");

            for(String ps : splitP){
                tmp += Integer.parseInt(ps);
            }

            if(i == 0)
                result += tmp;
            else
                result -= tmp;
        }

        System.out.println(result);

        return;
    }
}
