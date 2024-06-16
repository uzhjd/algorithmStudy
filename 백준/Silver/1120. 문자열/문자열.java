import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		String str1 = str[0];
		String str2 = str[1];

		int min = Integer.MAX_VALUE;

		int T = str2.length() - str1.length();
		for(int i = 0; i <= T; i++) {
			int tmp = 0;

			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(j + i)) {
					tmp++;
				}
			}
			min = Math.min(min, tmp);
		}

		System.out.println(min);

		return;
	}
}