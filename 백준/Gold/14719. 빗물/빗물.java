import java.util.*;
import java.io.*;


class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] arr = new int[W];
        boolean[][] board = new boolean[H][W];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < W; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < W; i++) {
            for(int j = 0; j < arr[i]; j++) {
//                System.out.print((H-j-1) + " " + i);
//                System.out.println();
                board[H-j-1][i] = true;
            }
        }

        int answer = 0;
        for(int i = 0; i < H; i++) {
            boolean flag = false;
            int sum = 0;

            for(int j = 0; j < W; j++) {
                if(flag) {
                    if(!board[i][j]) sum++;
                    else {
                        answer += sum;
                        sum = 0;
                    }
                } else {
                    if(board[i][j]) flag = true;

                }
            }
        }

        System.out.println(answer);
        return;
    }

}