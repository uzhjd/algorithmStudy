import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        int cnt = 0;
        int idx = 0;
        HashMap<String,String> nickName = new HashMap<>();
        
        // nickName change
        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            
            if(!info[0].equals("Leave")) {
                nickName.put(info[1], info[2]);
                
                if(info[0].equals("Change")) cnt++;
            }
        }
        
        
        String[] answer = new String[record.length - cnt];
        
        for(int i = 0; i < record.length; i++) {
            String[] check = record[i].split(" ");
            
            if(check[0].equals("Enter")) {
                answer[idx++] = nickName.get(check[1]) + "님이 들어왔습니다.";
            } else if(check[0].equals("Leave")) {
                answer[idx++] = nickName.get(check[1]) + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}