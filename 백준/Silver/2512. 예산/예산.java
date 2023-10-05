import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sc.nextLine();
        int M = Integer.parseInt(sc.nextLine());

        Arrays.sort(arr);

        long min = 0;
        long max = arr[arr.length - 1];

        while(min <= max) {
            long mid = (min + max) / 2;
            int sum = 0;

            for(int i = 0; i < N; i++) {
                if(arr[i] < mid) {
                    sum += arr[i];
                } else {
                    sum += mid;
                }
            }

            if(sum <= M) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);

        return;
    }
}