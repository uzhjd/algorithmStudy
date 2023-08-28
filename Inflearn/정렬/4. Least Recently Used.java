import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[s];

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            for(int j = 0; j < s; j++) {
                if(arr[j] == 0) {
                    for(int k = j; k > 0; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[0] = num;
                    break;
                } else if(arr[j] == num) {
                    for(int k = j; k > 0; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[0] = num;
                    break;
                } else if(j == s - 1) {
                    for(int k = j; k > 0; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[0] = num;
                }
            }
        }

        for(int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }

        return;
    }
}
