import java.io.*;
import java.util.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {

    static int N;
    static int M;
    static int chkCnt = 0;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Point> chiken = new ArrayList<>();
    static ArrayList<Point> home = new ArrayList<>();
    static ArrayList<Point> check = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++) {
                int n = Integer.parseInt(st.nextToken());

                if(n == 1) home.add(new Point(i, j));
                else if(n == 2) {
                    chiken.add(new Point(i, j));
                    chkCnt++;
                }
            }
        }

        comb(0);
        System.out.println(answer);
    }

    public static void comb(int s) {
        if(check.size() > M) return;

        if(check.size() > 0)
            answer = Math.min(answer, find());
        
        for(int i = s; i < chkCnt; i++) {
            check.add(chiken.get(i));
            comb(i + 1);
            check.remove(check.size()-1);
        }
    }

    public static int find() {
        int sum = 0;

        for(Point h : home) {
            int min = Integer.MAX_VALUE;

            for(Point c : check) {
                int n = Math.abs(h.x - c.x) + Math.abs(h.y - c.y);
                min = Math.min(min, n);
            }

            sum += min;
        }
        
        return sum;
    }
}