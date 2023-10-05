import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] A = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        sc.nextLine();

        int M = Integer.parseInt(sc.nextLine());
        int[] X = new int[M];

        for(int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for(int i = 0; i < M; i++) {
            boolean check = false;

            int min = 0;
            int max = A.length - 1;

            while(min <= max) {
                int mid = (min + max) / 2;

                if(A[mid] == X[i]) {
                    System.out.println("1");
                    check = true;
                    break;
                } else if(A[mid] > X[i])
                    max = mid - 1;
                else
                    min = mid + 1;
            }

            if(!check)
                System.out.println("0");
        }

        return;
    }
}