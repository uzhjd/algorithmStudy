import java.util.*;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int N, M;
    static int[] pComb;
    static int min = Integer.MAX_VALUE;
    static ArrayList<Point> pizza;
    static ArrayList<Point> home;
    static int pCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pizza = new ArrayList<>();
        home = new ArrayList<>();

        N = sc.nextInt();
        M = sc.nextInt();
        pComb = new int[M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int n = sc.nextInt();

                if(n == 1) home.add(new Point(i, j));
                else if(n == 2) pizza.add(new Point(i, j));
            }
        }

        pCnt = pizza.size();
        comb(0, 0);

        System.out.println(min);

        return;
    }
    static public void comb(int L, int s) {
        if(L == M) {
            min = Math.min(DFS(), min);
            return;
        }

        for(int i = s; i < pCnt; i++) {
            pComb[L] = i;
            comb(L + 1, i + 1);
        }
    }

    static public int DFS() {
        int sum = 0;

        for(Point h : home) {
            int r = Integer.MAX_VALUE;

            for(int i : pComb) {
                r = Math.min(Math.abs(pizza.get(i).x - h.x) + Math.abs(pizza.get(i).y - h.y), r);
            }
            sum += r;
        }

        return sum;
    }
}