import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        PriorityQueue<Integer> pqR = new PriorityQueue<>();
        PriorityQueue<Integer> pqL = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < t; i++) {
            int x = Integer.parseInt(sc.nextLine());

            if (x == 0) {
                if (pqR.peek() == null && pqL.peek() == null) {
                    System.out.println(0);
                } else if (pqR.peek() == null) {
                    System.out.println(pqL.poll());
                } else if (pqL.peek() == null) {
                    System.out.println(pqR.poll());
                } else {
                    if (pqR.peek() == Math.abs(pqL.peek())) {
                        System.out.println(pqL.poll());
                    } else if (pqR.peek() > Math.abs((pqL.peek()))) {
                        System.out.println(pqL.poll());
                    } else {
                        System.out.println(pqR.poll());
                    }
                }
            } else if (x > 0) {
                pqR.add(x);
            } else {
                pqL.add(x);
            }
        }
        return ;
    }
}