import java.util.*;

class Main {

    static ArrayList<String> answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N-- > 0) {
            int num = sc.nextInt();
            char[] arr = new char[num-1];
            answer = new ArrayList<>();

            DFS(0, num - 2, arr);
            Collections.sort(answer);
            for(String str : answer) {
                System.out.print(str);
            }
            System.out.println();
        }

        return;
    }

    private static void DFS(int i, int target, char[] arr) {
        if(i == target + 1) {
            calc(arr, target);
            return;
        }

        arr[i] = '+';
        DFS(i + 1, target, arr);
        arr[i] = '-';
        DFS(i + 1, target, arr);
        arr[i] = ' ';
        DFS(i + 1, target, arr);
    }

    private static void calc(char[] arr, int n) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        for (int i = 0; i <= n; i++) {
            if (arr[i] == '-') stack.add((-1) * (i + 2));
            else if (arr[i] == '+') stack.add(i + 2);
            else if (arr[i] == ' ') {
                int tmp = stack.pop();

                if (tmp < 0) tmp = tmp * 10 - (i + 2);
                else tmp = tmp * 10 + (i + 2);

                stack.add(tmp);
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        if(sum == 0) print(arr, n);
    }

    private static void print(char[] arr, int n) {
        String str = "";

        for(int i = 0; i <= n; i++) {
            str += (i+1);
            str += (arr[i]);
        }
        str += (n + 2) + "\n";

        answer.add(str);
    }
}