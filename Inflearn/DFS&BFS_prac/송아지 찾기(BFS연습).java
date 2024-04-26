import java.util.*;

public class Main {

    static int start;
    static int end;


    static boolean[] isSelected;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        start = sc.nextInt();
        end = sc.nextInt();

        System.out.println(BFS(start, end));

    }

    public static int BFS(int start, int end) {
        int[] go = {-1, 1, 5};
        boolean[] ch = new boolean[10001];
        LinkedList<Integer> que = new LinkedList<>();

        que.add(start);
        ch[start] = true;
        int L = 0;

        while(!que.isEmpty()) {
            L++;
            int len = que.size();

            for(int i = 0; i < len; i++) {
                int pos = que.poll();
                for(int j = 0; j < 3; j++) {
                    int nx = pos + go[j];

                    if(nx > 0 && nx < 10001 && !ch[nx]) {
                        if(nx == end) {
                            return L;
                        }

                        ch[nx] = true;
                        que.add(nx);

                    }
                }
            }

        }
        return 1;
    }
}