import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < 26; i++) {
            list.add(String.valueOf((char)('A' + i)));
        }
        
        for(int i = 0 ; i < msg.length() ; i++) {
            for(int j = list.size() - 1 ; j >= 0 ; j--) {
                if(msg.substring(i).startsWith(list.get(j))) {
                    i += list.get(j).length() - 1;
                    result.add(j + 1);
                    
                    if(i + 1 < msg.length())
                        list.add(list.get(j) + msg.charAt(i + 1));
                    break;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);   
        }
        
        return answer;
    }
}