import java.util.*;

public class Main {

    static String answer = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        DFS(N);
        StringBuffer sb = new StringBuffer(answer).reverse();
        System.out.println(sb);

        return;
    }

    public static void DFS(int n) {
        answer += (n % 2);

        if(n < 2) {
            return;
        }

        DFS(n/2);
    }
}