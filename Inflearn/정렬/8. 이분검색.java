import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sp = 0;
        int ep = N - 1;

        while(sp <= ep) {
            int mid = (ep + sp) / 2;

            if(arr[mid] == M) {
                System.out.println(mid + 1);
                break;
            } else if (arr[mid] > M) {
                ep = mid - 1;
            } else {
                sp = mid + 1;
            }
        }

        return;
    }
}
