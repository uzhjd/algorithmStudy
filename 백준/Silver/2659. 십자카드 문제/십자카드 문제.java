import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = getMin(a, b, c, d);

        boolean[] check = getClockNum();

        for(int i = 1111; i <= min; i++) {
            if(check[i]) {
                answer++;
            }
        }

        System.out.println(answer);
    }
    public static boolean[] getClockNum() {
        boolean[] visit = new boolean[10000];

        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        int min = getMin(a, b, c, d);

                        visit[min] = true;
                    }
                }
            }
        }

        return visit;
    }

    public static int getMin(int a, int b, int c, int d) {
        int min = Integer.MAX_VALUE;

        min = Math.min(min, a * 1000 + b * 100 + c * 10 + d);
        min = Math.min(min, b * 1000 + c * 100 + d * 10 + a);
        min = Math.min(min, c * 1000 + d * 100 + a * 10 + b);
        min = Math.min(min, d * 1000 + a * 100 + b * 10 + c);

        return min;
    }
}