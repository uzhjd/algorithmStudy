import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];

        for(int i = 0; i < N; i++) {
            sortedArr[i] = arr[i] = sc.nextInt();
        }

        Arrays.sort(sortedArr);

        for(int i = 0; i < N; i++) {
            if(arr[i] != sortedArr[i]) System.out.print((i + 1) + " ");
        }

        return;
    }
}
