import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for(int tc=0; tc<t; tc++) {
			String str = scan.next();
			int[] alpa = new int[26];
			boolean flag = true;
			String result = "";
            
			for(int i=0; i<str.length(); i++) {
				alpa[str.charAt(i) - 'A'] ++;
				
				if(alpa[str.charAt(i) - 'A'] == 3) {
					
					if(i == str.length()-1) {
						flag = false;
						break;
					}
					
					if(str.charAt(i) != str.charAt(i+1)) {
						flag = false;
						break;
					}
					
					i ++;
					
					alpa[str.charAt(i) - 'A'] = 0;
				}
			}
			result = (flag) ? "OK" : "FAKE";
			System.out.println(result);
			
		}
		
		scan.close();
	}

}