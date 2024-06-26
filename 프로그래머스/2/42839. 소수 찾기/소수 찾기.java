import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    int answer;
    boolean[] check;
    
    public int solution(String numbers) {
        answer = 0;
        check = new boolean[numbers.length()];
        
        dfs("", numbers);
        
        return answer;
    }
    
    public void dfs(String str, String numbers) {
        if(!str.equals("")) isAnswer(str);
        
        for(int i = 0; i < numbers.length(); i++) {
            dfs(str + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
    
    public void isAnswer(String str) {
        int n = Integer.parseInt(str);
        if(isPrime(n) && !set.contains(n)) {
            answer++; 
            set.add(n);
        }
    }
    
    public boolean isPrime(int n) {
        if(n < 2) return false;
        
        int mid = (int)Math.sqrt(n);
        for(int i = 2; i <= mid; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}