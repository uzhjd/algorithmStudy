import java.util.*;

class time implements Comparable<time> {
    public int s, e;

    time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(time t) {
        if(this.s == t.s) return this.e - t.e;
        return this.s - t.s;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        ArrayList<time> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            arr.add(new time(s, e));
        }
        Collections.sort(arr);

        int str = arr.get(0).s;
        int fin = arr.get(arr.size() - 1).e;
        for(int idx = str; idx < fin; idx++) {
            int cnt = 0;

            for(int j = 0; j < arr.size(); j++) {
                int ns = arr.get(j).s;
                int ne = arr.get(j).e;

                if(idx == ns) {
                    cnt++;
                } else if(idx < ns) {
                    continue;
                } else {
                    if(idx < ne) {
                        cnt++;
                    }
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);

        return;
    }
}