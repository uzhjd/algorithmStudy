import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int idx = 0;

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];

        for(int i = 0; i < N; i++) {
            sortedArr[i] = arr[i] = sc.nextInt();
        }

        Arrays.sort(sortedArr);

        for(int num : sortedArr) {
            if(!map.containsKey(num)) map.put(num, idx++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }

        System.out.println(sb);

        return;
    }
}