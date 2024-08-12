import java.io.*;
import java.util.*;

class Main {

    static int[][] pro = new int[4][8];
    static int[] dir;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < 4; i++) {
            String str = br.readLine();

            for(int j = 0; j < 8; j++)
                pro[i][j] = str.charAt(j) - 48;
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st  = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) - 1;
            int d = Integer.parseInt(st.nextToken());
            check = new boolean[4];
            dir = new int[4];

            check[num] = true;
            dir[num] = d;

            roll(num);
            move();
        }

        int answer = 0;
        for(int i = 0; i < 4; i++) {
            answer += (pro[i][0] * Math.pow(2, i));
        }

        System.out.println(answer);

        return;
    }

    public static void roll(int now) {
        int R = now + 1;
        int L = now - 1;

        if(R < 4 && R > -1 && !check[R]) {
            if(pro[now][2] != pro[R][6]) dir[R] = dir[now] * (-1);
            check[R] = true;
            roll(R);
        }
        if(L > -1 && L < 4 &&!check[L]) {
            if(pro[now][6] != pro[L][2]) dir[L] = dir[now] * (-1);
            check[L] = true;
            roll(L);
        }
    }

    public static void move() {
        for(int i = 0; i < 4; i++) {
            if(dir[i] == 0) continue;
            else if(dir[i] == 1) { // Right
                int tmp = pro[i][0];
                pro[i][0] = pro[i][7];
                pro[i][7] = pro[i][6];
                pro[i][6] = pro[i][5];
                pro[i][5] = pro[i][4];
                pro[i][4] = pro[i][3];
                pro[i][3] = pro[i][2];
                pro[i][2] = pro[i][1];
                pro[i][1] = tmp;
            } else if(dir[i] == -1) { // Left
                int tmp = pro[i][0];
                pro[i][0] = pro[i][1];
                pro[i][1] = pro[i][2];
                pro[i][2] = pro[i][3];
                pro[i][3] = pro[i][4];
                pro[i][4] = pro[i][5];
                pro[i][5] = pro[i][6];
                pro[i][6] = pro[i][7];
                pro[i][7] = tmp;
            }
        }
    }
}