import java.util.*;

class Con implements Comparable<Con> {
    public int time;
    public char state;

    Con(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Con c) {
        if(this.time == c.time) return this.state - c.state;
        return this.time - c.time;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        ArrayList<Con> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            arr.add(new Con(s, 's'));
            arr.add(new Con(e, 'e'));
        }
        Collections.sort(arr);

        int cnt = 0;
        for(Con c : arr) {
            if(c.state == 's') cnt++;
            else if(c.state == 'e') cnt--;

            max = Math.max(max, cnt);
        }

        System.out.println(max);

        return;
    }
}