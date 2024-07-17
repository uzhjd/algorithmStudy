import java.io.*;
import java.util.*;

class Main {

    public static int[][] board;
    public static boolean[] check;
    public static int N;
    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        check = new boolean[N];

        for(int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        setTeam(0, 0);

        System.out.println(answer);
    }

    static public void setTeam(int s, int cnt) {
        if(cnt == N/2) {
            answer = Math.min(answer, calc());
            
        }
        if(s >= N) return;

        for(int i = s; i < N; i++) {
            check[i] = true;
            setTeam(i + 1, cnt + 1);
            check[i] = false;
        }
    }

    static public int calc() {
        int[] teamA = new int[N/2];
        int[] teamB = new int[N/2];
        int cntA = 0;
        int cntB = 0;

        for(int i = 0; i < N; i++) {
            if(check[i]) teamA[cntA++] = i;
            else teamB[cntB++] = i;
        }

        int sumA = 0;
        for(int i = 0; i < N/2 - 1; i++) {
            for(int j = i + 1; j < N/2; j++) {
                int a = teamA[i];
                int b = teamA[j];
                sumA += board[a][b] + board[b][a];
            }
        }

        int sumB = 0;
        for(int i = 0; i < N/2 - 1; i++) {
            for(int j = i + 1; j < N/2; j++) {
                int a = teamB[i];
                int b = teamB[j];
                sumB += board[a][b] + board[b][a];
            }
        }
        
        return Math.abs(sumA - sumB);
    }
}