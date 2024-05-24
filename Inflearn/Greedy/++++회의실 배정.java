import java.util.*;

class conference implements Comparable<conference> {
    public int s, e;

    conference(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(conference o) {
        if(this.e == o.e) return this.s - o.s;
        return this.e - o.e;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int time = 0;
        int cnt = 0;
        ArrayList<conference> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            arr.add(new conference(s, e));
        }
        Collections.sort(arr);

        for(conference c : arr) {
            if(time <= c.s) {
                cnt++;
                time = c.e;
            }
        }

        System.out.println(cnt);

        return;
    }
}
