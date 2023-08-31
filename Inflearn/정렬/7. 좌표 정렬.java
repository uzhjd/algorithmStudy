import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
           }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                return n1[0]!=n2[0] ? n1[0] - n2[0] : n1[1] - n2[1];
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        return;
    }
}
