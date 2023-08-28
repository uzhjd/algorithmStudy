import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());
        int[] n = new int[k];

        for(int i = 0; i < k; i++) {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < k - 1; i++) {
           for(int j = 0; j < k - i - 1; j++) {
               if(n[j] > n[j + 1]) {
                   int tmp = n[j];
                   n[j] = n[j + 1];
                   n[j + 1] = tmp;
               }
           }
        }

        for(int i = 0; i < k; i++) {
            System.out.print(n[i] + " ");
        }

        return;
    }
}
