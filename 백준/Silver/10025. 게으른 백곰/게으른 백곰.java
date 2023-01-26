import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K, w, p, max = 0, sum = 0, d;
        int[] arr = new int[1000001];

        N = sc.nextInt();
        K = sc.nextInt();

        d = 1 + (K * 2);

        for(int i = 0; i < N; i++) {
            w = sc.nextInt();
            p = sc.nextInt();

            arr[p] = w;
        }

        for(int i = 0; i < 1000000; i++){
            if(i >= d){
                sum -= arr[i - d];
            }

            sum += arr[i];

            if(sum > max)
                max = sum;

        }

        System.out.println(max);
    }
}