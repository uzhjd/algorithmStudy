import java.util.*;

class Solution {
    
    HashSet<Integer> numSet = new HashSet<>();
    
    public boolean isPrime(int n) {
        if(n < 2) return false;
        
        int lim = (int)Math.sqrt(n);
        
        for(int i = 2; i <= lim; i++)
            if(n % i == 0) return false;
        
        return true;
    }
    
    public void makeNum(String comb, String others) {
        if(!comb.equals(""))
            numSet.add(Integer.parseInt(comb));
            
        for(int i = 0; i < others.length(); i++) {
            makeNum(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }        
    }
    
    public int solution(String numbers) {
        int answer = 0;
        makeNum("", numbers);
  
        Iterator<Integer> it = numSet.iterator();
        while(it.hasNext()) {
            if(isPrime(it.next())) answer++;
        }
        
        return answer;
    }
}