import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        dfs("", numbers);
        
        return set.size();
    }
    
    public void dfs(String str, String numbers) {
        if(!str.equals("")) isAnwer(str);
        
        for(int i = 0; i < numbers.length(); i++) {
            dfs(str + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
    
    public void isAnwer(String str) {
        int num = Integer.parseInt(str);
        if(isPrime(num)) {
            set.add(num);
        }
    }
    
    public boolean isPrime(int n) {
        if(n < 2) return false;
        int half = n / 2;
        
        for(int i = 2; i <= half; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}