import java.util.*;

class road implements Comparable<road> {
    public int a, b, cost;

    road (int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    @Override
    public int compareTo(road r) {
        return this.cost - r.cost;
    }
}

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<road> list = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N + 1];
        int answer = 0;

        for(int i = 1; i <= N; i++) arr[i] = i;
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            list.add(new road(a, b, c));
        }
        Collections.sort(list);

        for(road r : list) {
            int fa = find(r.a);
            int fb = find(r.b);

            if(fa != fb) {
                answer += r.cost;
                union(r.a, r.b);
            }
        }

        System.out.println(answer);

        return;
    }

    public static int find(int v) {
        if(v == arr[v]) return v;
        return arr[v] = find(arr[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb) arr[fa] = fb;
    }
}