import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> over = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> under = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
           int num = Integer.parseInt(br.readLine());

           if(num <= 0) under.add(num);
           else over.add(num);
        }

        StringBuilder sb = new StringBuilder();

        if(n == 1) {
            if(!over.isEmpty()) sb.append(over.poll());
            else sb.append(under.poll());
        } else {
            sb.append(getNum(over) + getNum(under));
        }

        System.out.println(sb);
    }

    static int getNum(PriorityQueue<Integer> pq) {
        int answer = 0;

        while(!pq.isEmpty()) {
            int n = pq.poll();

            if(pq.isEmpty()) {
                answer += n;
                return answer;
            }

            int m = pq.peek();

            if(n * m > n + m){
                answer += n * m;
                pq.poll();
            } else {
                answer += n;
            }
        }

        return answer;
    }
}