import java.util.*;

public class Main {

    static int N;
    static int[] cur;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        cur = new int[N];

        for(int i = 0; i < N; i++) {
            cur[i] = sc.nextInt();
        }

        if(perviousPermutation()) {
            for(int i = 0; i < N; i++) {
                System.out.print(cur[i] + " ");
            }
        } else System.out.println("-1");
    }

    public static boolean perviousPermutation() {
        int change = -1;
        int point = -1;

        for(int i = N - 1; i > 0; i--) {
            if(cur[i - 1] > cur[i]) {
                point = i;
                break;
            }
        }
        if(point == -1) return false;

        for(int i = N - 1; i > 0; i--) {
            if(cur[point - 1] > cur[i]) {
                change = i;
                break;
            }
        }

        swap(point - 1, change);

        change = N - 1;
        while(change > point) {
            swap(change, point);
            point++;
            change--;
        }
        return true;
    }

    public static void swap(int a, int b) {
        int tmp = cur[a];
        cur[a] = cur[b];
        cur[b] = tmp;
    }
}