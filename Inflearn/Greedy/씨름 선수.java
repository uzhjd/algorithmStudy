import java.util.*;

class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Body> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            list.add(new Body(h, w));
        }

        Collections.sort(list);

        for(Body o : list){
            if(max < o.w){
                cnt++;
                max = o.w;
            }
        }

        System.out.println(cnt);

        return;
    }
}
