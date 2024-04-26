import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print("1 1 ");
        DFS(1, 1, N, 3);

        return;
    }

    public static void DFS(int a, int b, int n, int cnt) {
        if(n < cnt) return;

        a= a+b;
        System.out.print(a + " ");

        DFS(b, a, n, cnt+1);
    }
}