import java.util.*;

public class Main {

    static int[] num;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] operator = new int[4];

        cnt = sc.nextInt();
        num = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        dfs(operator, 1, num[0]);

        System.out.println(max);
        System.out.println(min);

        return;
    }

    static public void dfs(int[] operator, int L, int sum) {
        if(L == cnt) {
            if(sum > max) max = sum;
            if(sum < min) min = sum;

            return;
        }

        if(operator[0] != 0) {
            operator[0]--;
            dfs(operator, L + 1, sum + num[L]);
            operator[0]++;
        }
        if(operator[1] != 0) {
            operator[1]--;
            dfs(operator, L + 1, sum - num[L]);
            operator[1]++;
        }
        if(operator[2] != 0) {
            operator[2]--;
            dfs(operator, L + 1, sum * num[L]);
            operator[2]++;
        }
        if(operator[3] != 0) {
            operator[3]--;
            dfs(operator, L + 1, sum / num[L]);
            operator[3]++;
        }

        return;
    }
}