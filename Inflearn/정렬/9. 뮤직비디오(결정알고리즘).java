import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(check(arr, mid) <= M) { // 더 할수 있다!!
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);

        return;
    }

    public static int check(int[] arr, int m) {
        int cnt = 1;
        int sum = 0;

        for(int n : arr) {
           if(sum + n > m) {
               cnt++;
               sum = n;
            } else sum += n;
        }

        return cnt;
    }
}
