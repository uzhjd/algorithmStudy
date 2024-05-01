import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] ch;
    static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        ch = new boolean[N];
        answer = new int[M];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0);

        return;
    }

    static public void DFS(int L) {
        if(L == M) {
            for(int i = 0; i < M; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!ch[i]) {
                ch[i] = true;
                answer[L] = arr[i];
                DFS(L+1);
                ch[i] = false;
            }
        }

        return;
    }
}