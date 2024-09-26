import java.util.*;
import java.io.*;

class Point {
    int x, y;

    Point(int y, int x) {
        this.x = x;
        this.y = y;
    }
}

class Main {

    static HashMap<Integer, Point> map = new HashMap<>();
    static int[][] board;
    static int total = 0;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        board = new int[5][5];

        for(int i = 0; i < 5; i ++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());

                board[i][j] = n;
                map.put(n, new Point(i, j)); // y, x
            }
        }

        int answer = 0;
        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 5; j++) {
                answer++;
                if (checkBoard(Integer.parseInt(st.nextToken()))) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }


    static private boolean checkBoard(int n) {
        Point p = map.get(n);
        boolean answer = false;
        board[p.y][p.x] = 0;

        total+=checkBingo(p.x, p.y);
        if(total >= 3) answer = true;

        return answer;
    }

    static private int checkBingo(int x, int y) {
        int answer = 0;

        boolean flag = true;
        if(x == y) {
            for(int i = 0; i < 5; i++) {
                if(board[i][i] != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }


        if(x == 4-y) {
            flag = true;
            for(int i = 0; i < 5; i++) {
                if(board[i][4 - i] != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }

        flag = true;
        for(int i = 0; i < 5; i++) {
            if (board[i][x] != 0) {
                flag = false;
                break;
            }
        }
        if(flag) answer++;

        flag = true;
        for(int i = 0; i < 5; i++) {
            if (board[y][i] != 0) {
                flag = false;
                break;
            }
        }
        if(flag) answer++;

        return answer;
    }

}