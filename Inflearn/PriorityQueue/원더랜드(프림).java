import java.util.*;

class road implements Comparable<road> {
    public int e, cost;

    road(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }

    @Override
    public int compareTo(road r) {
        return this.cost - r.cost;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<road>> list = new ArrayList<ArrayList<road>>();
        int answer = 0;
        PriorityQueue<road> pq = new PriorityQueue<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] check = new boolean[N + 1];

        for(int i = 0; i <= N; i++) list.add(new ArrayList<road>()); //왜 0부터 1까지 인지도 모르겠음.
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            list.get(a).add(new road(b, c));
            list.get(b).add(new road(a, c));
        }

        pq.add(new road(1, 0));
        while(!pq.isEmpty()) {
            road nr = pq.poll();

            if(!check[nr.e]) {
                answer += nr.cost;
                check[nr.e] = true;

                for(road r : list.get(nr.e)) {
                    if(!check[r.e]) pq.add(r);
                }
            }
        }

        System.out.println(answer);

        return;
    }
}