import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(DFS(N));

        return;
    }

    public static int DFS(int n) {
        if(n < 2) {
            return n;
        }

        return n * DFS(n-1);
    }
}