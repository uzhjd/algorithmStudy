import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    void makeNum(String combin, String str) {
        if(!combin.equals(""))
            set.add(Integer.parseInt(combin));
        
        for(int i = 0; i < str.length(); i++) {
            makeNum(combin + str.charAt(i), str.substring(0, i) + str.substring((i + 1), str.length()));
        }
    }
    
    public Boolean isPrime(int n) {
        if(n < 2) return false;
        
        int limit = (int)Math.sqrt(n);
        
        for(int i = 2; i <= limit; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        makeNum("", numbers);
        
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if(isPrime(it.next()))
                answer++;
        }
        
        return answer;
    }
}