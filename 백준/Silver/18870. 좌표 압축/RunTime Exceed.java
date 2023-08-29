** 시간 초과가 나서 StringBuilder로 출력하고,
   TreeMap 대신 Arrays.sort()와 HashMap을 사용했다. (HashMap보다 TreeMap이 더 느림.)

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int idx = 0;

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], i);
        }

        for(int num : map.keySet()) {
            map.put(num, idx++);
        }

        for(int i = 0; i < N; i++) {
            System.out.print(map.get(arr[i]) + " ");
        }
        
        return;
    }
}
