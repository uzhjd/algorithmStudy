import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] line = new int[N+1];
		for(int i = 1 ; i<= N ; i++) {
			int counts = Integer.parseInt(st.nextToken());
			for(int j = 1; j<= N ;j ++) {
				if(counts==0) {
					if(line[j]==0) {
						line[j] = i; 
						break;
					}
					else {
                        continue;
					}
				}
				else if(line[j]==0) {
                    counts--;
				}
			
			}
		} 
		for(int i =1 ; i<=N ;i++) {
            System.out.print(line[i]+" ");}
	}
		
}