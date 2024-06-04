import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N + 1];

        for(int i = 1; i <= N; i++)
            arr[i] = i;
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            union(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        int fa = find(a);
        int fb = find(b);
        if(fa != fb) System.out.println("NO");
        else System.out.println("YES");

        return;
    }

    public static int find(int v) {
        if(v == arr[v]) return v;
        return arr[v] = find(arr[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb) arr[fa] = fb;
    }
}