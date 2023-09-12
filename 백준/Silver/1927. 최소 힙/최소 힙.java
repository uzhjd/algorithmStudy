import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = Integer.parseInt(sc.nextLine());

        while(N > 0) {
            int x = Integer.parseInt(sc.nextLine());

            if(x != 0) {
                pq.add(x);
            } else {
                int answer = 0;
                if(pq.peek() != null) answer = pq.poll();

                System.out.println(answer);
            }

            N--;
        }

        return;
    }
}