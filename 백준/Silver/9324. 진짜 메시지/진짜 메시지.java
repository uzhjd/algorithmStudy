import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			int[] alpha = new int[26];
			boolean flag = true;
			String str = sc.next();

			for(int j = 0; j < str.length(); j++) {
				alpha[str.charAt(j) - 'A']++;

				if(alpha[str.charAt(j) - 'A'] == 3) {
					if(j == str.length() - 1) {
						flag = false;
						break;
					}
					if(str.charAt(j) != str.charAt(j + 1)) {
						flag = false;
						break;
					}

					j ++;
					alpha[str.charAt(j) - 'A'] = 0;
				}
			}

			String answer = flag ? "OK" : "FAKE";
			System.out.println(answer);
		}
	}
}