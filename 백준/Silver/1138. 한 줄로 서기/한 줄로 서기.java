import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] tmp = new int[n + 1];
		List<Integer> ans = new ArrayList<>();

		for(int i = 1; i <= n; i++) {
			tmp[i] = scan.nextInt();
		}

		for(int k : ans) {
			System.out.print(k+" ");
		}
	}

}