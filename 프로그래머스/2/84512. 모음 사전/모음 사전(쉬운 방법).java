import java.util.*;

class Solution {
    final int MAX_SIZE = 5;
    String vowels = "AEIOU";
    
    public int solution(String word) {
        int answer = 0;
         List<String> dictionary = new ArrayList<>();
        
        for(int i = 0; i < vowels.length(); i++)  {
             DFS(dictionary, String.valueOf(vowels.charAt(i)));
        }
        
        for(int i = 0; i < dictionary.size(); i++) {
           if(dictionary.get(i).equals(word)) {
               answer = i + 1;
               break;
           } 
        }
        
        return answer;
    }
    
    public void DFS(List<String> dictionary, String str) {
        if(str.length() > MAX_SIZE) return;
        
        if(!dictionary.contains(str)) dictionary.add(str);
        
        for(int i = 0; i < vowels.length(); i++)
            DFS(dictionary, str + vowels.charAt(i));
        
    }
}
