import java.util.*;

class Point implements Comparable<Point> {
    public int m, d;

    Point(int m, int d) {
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Point p) {
        if(p.d == this.d) return p.m - this.m;
        return p.d - this.d;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Point> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = sc.nextInt();
        int total = 0;


        for(int i = 0; i < N; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();

            list.add(new Point(money, day));
        }

        Collections.sort(list);

        int day = list.get(0).d;
        int j = 0;

        for(int i = day; i > 0; i--) {
            for(; j < N; j++){
                if(list.get(j).d < i) {
                    break;
                }
                pq.add(list.get(j).m);
            }
            if(!pq.isEmpty())
                total += pq.poll();
        }

        System.out.println(total);
        return;
    }

}