import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());
        int[] n = new int[k];

        for(int i = 0; i < k; i++) {
            n[i] = sc.nextInt();
        }

        for(int i = 1; i < k; i++) {
           for(int j = i - 1; j > -1; j--) {
               if(n[j] > n[j + 1]) {
                   int tmp = n[j];
                   n[j] = n[j + 1];
                   n[j + 1] = tmp;
               } else break;
           }
        }

        for(int i = 0; i < k; i++) {
            System.out.print(n[i] + " ");
        }

        return;
    }
}
