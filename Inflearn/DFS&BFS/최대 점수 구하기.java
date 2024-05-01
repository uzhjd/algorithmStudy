import java.util.*;

public class Main {

    static int[] arrT;
    static int[] arrS;
    static int max = Integer.MIN_VALUE;
    static int N;
    static int M;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arrT = new int[N];
        arrS = new int[N];

        for(int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();

            arrT[i] = t;
            arrS[i] = s;
        }

        DFS(0, 0, 0);
        System.out.println(max);

        return;
    }

    static public void DFS(int sumT, int sumS,int L) {
        if(sumT > M) return;
        if(N == L) {
            max = Math.max(max, sumS);
            return;
        }

        DFS(sumT + arrT[L], sumS + arrS[L], L + 1);
        DFS(sumT, sumS, L + 1);

        return;
    }
}