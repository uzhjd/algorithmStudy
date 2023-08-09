import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int order = 1;

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }

        int i = 0;

        while(!queue.isEmpty()) {
            if(order == queue.peek()) {
                queue.poll();
                order++;
            } else if(!stack.isEmpty() && order == stack.peek()) {
                stack.pop();
                order++;
            } else {
                stack.add(queue.poll());
            }
        }

        while(!stack.isEmpty()) {
            if(order == stack.peek()) {
                stack.pop();
                order++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");

        return;
    }
}
