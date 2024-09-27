import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        while(T-- > 0) {
            String order = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();
            str = str.substring(1, str.length()-1); // 양 끝의 [] 제거

            Deque<Integer> deque = new ArrayDeque<>();
            if (!str.isEmpty()) {
                String[] elements = str.split(",");
                for (String elem : elements) {
                    deque.add(Integer.parseInt(elem));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char cmd : order.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    if (isReversed) {
                        sb.append(deque.removeLast());
                    } else {
                        sb.append(deque.removeFirst());
                    }
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}