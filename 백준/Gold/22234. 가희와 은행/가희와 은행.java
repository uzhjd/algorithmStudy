import java.io.*;
import java.util.*;

class customer implements Comparable<customer> {
    int id, time, start;

    customer(int id, int time, int start) {
        this.id = id;
        this.time = time;
        this.start = start;
    }

    @Override
    public int compareTo(customer c) {
        return this.start - c.start;
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int now = 0;

        Queue<customer> que = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            que.add(new customer(id, time, 0));
        }

        int M = Integer.parseInt(br.readLine());
        PriorityQueue<customer> pq = new PriorityQueue<>();
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());

            pq.add(new customer(id, time, start));
        }

        while(!que.isEmpty() && now < W) {
            customer nc = que.poll();
            int min = Math.min(nc.time, T);

            for(int i = 0; i < min; i++) {
                if(now >= W) break;
                sb.append(nc.id + "\n");
                now++;
            }
            nc.time -= min;

            while(!pq.isEmpty() && pq.peek().start <= now) {
                que.add(pq.poll());
            }

            if(nc.time > 0)
                que.add(new customer(nc.id, nc.time, 0));
        }

        System.out.println(sb);
    }
}