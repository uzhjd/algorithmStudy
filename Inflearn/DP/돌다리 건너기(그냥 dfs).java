import java.util.*;


public class Main {

    static int answer = 0;
    static int target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        target = sc.nextInt() + 1;

        DFS(0);


        System.out.println(answer);

        return;
    }

    static public void DFS(int total) {
        if(total == target) {
            answer++;
            return;
        }
        if(total > target)
            return;

        DFS(total + 1);
        DFS(total + 2);
    }

}