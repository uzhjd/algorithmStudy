import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int  X = Integer.parseInt(bf.readLine());

            if(X == 0) {
                sb.append(pq.size() == 0 ? 0 : pq.poll()).append('\n');
            } else {
                pq.add(X);
            }
        }

        System.out.println(sb.toString());

        return;
    }
}
