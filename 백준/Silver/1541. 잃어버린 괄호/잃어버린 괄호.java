import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        int answer = 0;
        String[] minus_spl = exp.split("-");

        for(int i = 0; i < minus_spl.length; i++){
            int sum = 0;
            String[] plus_spl = minus_spl[i].split("\\+");

            for(String ps : plus_spl){
                sum += Integer.parseInt(ps);
            }

            if(i == 0)
                answer += sum;
            else
                answer -= sum;
        }

        System.out.println(answer);

        return;
    }
}